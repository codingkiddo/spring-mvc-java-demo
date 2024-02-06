package com.spring.quickstarts.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "com.spring.quickstarts.repository.jpa")
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
	public BeanPostProcessor persistenceTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
//		jtaTransactionManager.setTransactionManagerName("java:jboss/TransactionManager");
//		jtaTransactionManager.setUserTransactionName("java:jboss/UserTransaction");
		return jtaTransactionManager;
	}

//	@Bean
//	@Profile("development")
//	public DataSource embeddedDataSource() {
//		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("schema.sql")
//				.addScript("classpath:test-data.sql").build();
//	}

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
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
			JpaVendorAdapter jpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
		emfb.setDataSource(dataSource);
		emfb.setPersistenceUnitName("spitter");
		emfb.setJpaVendorAdapter(jpaVendorAdapter);
		Properties properties = new Properties();
		properties.setProperty("hibernate.allow_update_outside_transaction", "true");
//		emfb.setJpaProperties(properties);
		emfb.setPackagesToScan("com.spring.quickstarts.model");
		return emfb;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(false);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
		return adapter;
	}

//	@Bean
//	public LocalSessionFactoryBean sessionFactory() {
//		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
//		sfb.setDataSource(dataSource());
//		sfb.setPackagesToScan(new String[] { "com.spring.quickstarts.model" });
//		Properties properties = new Properties();
//		properties.setProperty("dialect", "org.hibernate.dialect.MySQL8Dialect");
//		sfb.setHibernateProperties(properties);
//		return sfb;
//	}

//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
//		hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
//		return hibernateTransactionManager;
//	}

//	@Bean
//	public JdbcOperations jdbcTemplate(DataSource dataSource) {
//		return new JdbcTemplate(dataSource);
//	}

}
