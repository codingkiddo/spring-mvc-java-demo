package com.spring.quickstarts.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/admin/**").access("isAuthenticated() and principal.username=='habuma'")
			.and().formLogin().and().httpBasic();
		
		http.csrf().disable();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.ldapAuthentication()
				.userSearchBase("ou=people")
				.userSearchFilter("(uid={0})")
				.groupSearchBase("ou=groups")
				.groupSearchFilter("member={0}").groupRoleAttribute("cn").rolePrefix("ROLE_")
				.contextSource().root("dc=habuma,dc=com").ldif("classpath:users.ldif").and()
				.passwordCompare()
				.passwordEncoder(new Md5PasswordEncoder())
				.passwordAttribute("userPassword");
	}
	
}
