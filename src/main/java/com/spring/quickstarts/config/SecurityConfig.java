package com.spring.quickstarts.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.inMemoryAuthentication().withUser("admin")
			.password("1234").roles("ADMIN");
		
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/greet/admin").hasRole("ADMIN").and()
			.formLogin();
		
		http.csrf().disable();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
//
//
//This is equivalent to the following configuration in XML: 
//<http auto-config="true">
//    <intercept-url pattern="/admin**" access="hasRole('ADMIN')" />
//    <csrf disabled="true" />
//</http>
// 
//<authentication-manager>
//    <authentication-provider>
//        <user-service>
//            <user name="admin" password="nimda" authorities="ADMIN" />
//        </user-service>
//    </authentication-provider>
//</authentication-manager>


//Note that we disable CSRF for the sake of simplicity in this tutorial:
//http.csrf().disable();
//That tells Spring Security to intercept the /logout link as an HTTP GET request. 
//In production, you should enable CSRF for best security practice.
