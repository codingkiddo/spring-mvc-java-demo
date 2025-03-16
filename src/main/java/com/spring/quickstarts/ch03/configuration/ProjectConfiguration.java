package com.spring.quickstarts.ch03.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages =  { 
		"com.spring.quickstarts.ch03.proxies", 
		"com.spring.quickstarts.ch03.services", 
		"com.spring.quickstarts.ch03.repositories"
} )
public class ProjectConfiguration {
}
