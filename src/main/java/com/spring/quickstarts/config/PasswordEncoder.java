package com.spring.quickstarts.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("password"));
	}
}
