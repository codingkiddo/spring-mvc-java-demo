package com.spring.quickstarts.controllers;

import javax.naming.NamingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
    public String getHome() throws NamingException {
        return "home";
    }
}