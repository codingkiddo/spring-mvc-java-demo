package com.spring.quickstarts.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.quickstarts.model.Spitter;

@RestController
@RequestMapping("/spitter")
public class SpitterController {

	private List<Spitter> getSpitters() {
		return null;
	}
	
	@RequestMapping(value = "/register", method = POST)
	public List<Spitter> processRegistration(@Valid Spitter spitter, Errors errors) {
		
		return null;
	}


}
