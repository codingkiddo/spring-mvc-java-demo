
package com.spring.quickstarts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("greet")
public class GreetController {

	
//	@RequestMapping(method = RequestMethod.GET)
	/*
	 * 
	 * This is fucking greet method
	 * 
	 */
	@GetMapping("/")
    public String getInitialMessage() {
        return "greet";
    }
}
