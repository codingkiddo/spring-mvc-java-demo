package com.spring.quickstarts.controllers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.spring.quickstarts.config.MvcConfig;

public class SpringWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(MvcConfig.class);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", 
				new DispatcherServlet(context));
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
	}

}

//
//
//Here, the SpringWebAppInitializeris a type of WebApplicationInitializerwhich 
//is bootstrapped automatically by any Servlet 3.0+ container 
//(See more: Bootstrapping a Spring Web MVC application programmatically).
//The above code is equivalent to the following XML snippet in the web.xml:
//<servlet>
//    <servlet-name>SpringController</servlet-name>
//    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//    <init-param>
//        <param-name>contextConfigLocation</param-name>
//        <param-value>/WEB-INF/spring-mvc.xml</param-value>
//    </init-param>
//    <load-on-startup>1</load-on-startup>
//</servlet>
// 
//<servlet-mapping>
//    <servlet-name>SpringController</servlet-name>
//    <url-pattern>/</url-pattern>
//</servlet-mapping>