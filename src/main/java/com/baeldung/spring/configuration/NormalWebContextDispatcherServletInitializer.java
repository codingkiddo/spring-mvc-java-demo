package com.baeldung.spring.configuration;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class NormalWebContextDispatcherServletInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext normalServletContext = new AnnotationConfigWebApplicationContext();
		normalServletContext.register(NormalWebAppConfig.class);
		return normalServletContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/api/*"};
	}

	@Override
	protected String getServletName() {
	    return "normal-dispatcher";
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}

}
