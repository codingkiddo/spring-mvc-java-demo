package com.baeldung.spring.configuration;

import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;


public class EmployeeAppRootContextLoaderInitializer extends AbstractContextLoaderInitializer {

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		System.out.println("<--------- createRootApplicationContext --------->");
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(RootApplicationConfig.class);
		System.out.println("<--------- createRootApplicationContext --------->");
		return context;
	}

}
