package com.spring.quickstarts.config;

import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

//	@Bean
//	public TransactionManager transactionManagerName() {
//		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
//		jndiObjectFactoryBean.setJndiName("java:jboss/TransactionManager");
//		return (TransactionManager) jndiObjectFactoryBean.getObject();
//	}
//	
//	@Bean 
//	public UserTransaction userTransactionName() {
//		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
//		jndiObjectFactoryBean.setJndiName("java:jboss/UserTransaction");
//		return (UserTransaction) jndiObjectFactoryBean.getObject();
//	}
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
//		jtaTransactionManager.setTransactionManagerName("java:jboss/TransactionManager");
//		jtaTransactionManager.setUserTransactionName("java:jboss/UserTransaction");
		return jtaTransactionManager;
	}
	
	@Bean
	@Profile("development")
	public DataSource embeddedDataSource() {
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("schema.sql")
				.addScript("classpath:test-data.sql").build();
	}

	@Bean
	@Profile("production")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useSSL=false&createDatabaseIfNotExist=true");
		dataSource.setUsername("root");
		dataSource.setPassword("12345678");
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
		sfb.setDataSource(dataSource());
		sfb.setPackagesToScan(new String[] { "com.spring.quickstarts.model" });
		Properties properties = new Properties();
		properties.setProperty("dialect", "org.hibernate.dialect.MySQL8Dialect");
		sfb.setHibernateProperties(properties);
		return sfb;
	}

//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
//		hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
//		return hibernateTransactionManager;
//	}
	
	@Bean
	public JdbcOperations jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
