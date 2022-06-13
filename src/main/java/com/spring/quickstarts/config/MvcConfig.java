package com.spring.quickstarts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.spring.quickstarts")
public class MvcConfig {

	@Bean(name="viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
}


//As you can see, we configure this InternalResourceViewResolverbean to resolve logical view names to physical JSP pages. 
//It's equivalent to the following XML:
//
//<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//    <property name="prefix" value="/WEB-INF/views/" />
//    <property name="suffix" value=".jsp" />
//</bean>