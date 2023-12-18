package com.baeldung.spring.configuration;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class SecureWebContextDispatcherServletInitializer  extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(SecureWebAppConfig.class);
		return webApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/s/api/*" };
	}

	@Override
	protected String getServletName() {
	    return "secure-dispatcher";
	}
	
	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}

}
