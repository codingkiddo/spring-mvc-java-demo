package com.spring.quickstarts.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class SpringFactoryBean implements FactoryBean<String>{

	@Nullable
	private String sessionFactory = "TESTING-FactoryBean";
	
	@Override
	public String getObject() throws Exception {
		return this.sessionFactory;
	}

	@Override
	public Class<?> getObjectType() {
		return (this.sessionFactory != null ? this.sessionFactory.getClass() : SessionFactory.class);
	}

}
