package com.spring.quickstarts.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Home Id Not Found !!!!!!")
public class HomeIdNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6840580557990789805L;
	
	public HomeIdNotFoundException(String message) {
		super(message);
	}

}
