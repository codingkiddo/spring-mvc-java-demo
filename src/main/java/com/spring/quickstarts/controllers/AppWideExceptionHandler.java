package com.spring.quickstarts.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {

	@ExceptionHandler(HomeIdNotFoundException.class)
	public String homeIdNotFoundEx() {
		return "error-advice-home";
	}
	
}
