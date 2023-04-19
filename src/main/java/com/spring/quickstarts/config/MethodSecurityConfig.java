package com.spring.quickstarts.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, 
							securedEnabled = true, 
							jsr250Enabled = true
							)
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
		.withUser("admin").password("admin").roles("ADMIN")
		.and().withUser("user").password("user").roles("USER");
	}
}
