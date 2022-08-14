
package com.spring.quickstarts.controllers;

import javax.naming.NamingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("greet")
public class GreetController {

	
	@RequestMapping(method = RequestMethod.GET)
    public String getInitialMessage() throws NamingException {
		
        return "home";
    }

   
}
