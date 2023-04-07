package com.spring.quickstarts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
//@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/admin/**").access("hasRole('ADMIN')")
			.and().formLogin().and().httpBasic();
		
		http.csrf().disable();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
//			.withUser("admin").password("admin").roles("ADMIN")
//			.and().withUser("user").password("user").roles("USER");
		
//		OR
		
		auth.inMemoryAuthentication()
		.withUser("admin").password("{noop}admin").roles("ADMIN")
		.and().withUser("user").password("{noop}user").roles("USER");
	}
	
}
