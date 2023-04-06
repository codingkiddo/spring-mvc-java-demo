package com.spring.quickstarts.controllers;

import javax.naming.NamingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/home")
//@RestController
public class HomeController {
	@RequestMapping(value="/test", method = RequestMethod.GET)
    public String getHome() throws NamingException {
        return "home";
    }
	
	
	@RequestMapping(value = {"/check", "/check/{homeId}"}, method = RequestMethod.GET)
    public String checkHomeId(@PathVariable(name = "homeId", required = false) String homeId) throws HomeIdNotFoundException {
		if(homeId == null) {
			throw new HomeIdNotFoundException("HomeIdNotFoundException");
		}
        return "greet";
    }
	
//	Has first priority
//	@ExceptionHandler(HomeIdNotFoundException.class)
//	public String handleException() {
//		return "error";
//	}
}
