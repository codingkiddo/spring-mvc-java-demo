package com.baeldung.spring.configuration.normal.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("normal")
public class NormalHelloWorldController {
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@GetMapping(path = "/hello")
    public ModelAndView helloWorld() {
        String message = "<br><div style='text-align:center;'>" + "<h3>Normal " + "Controller !!!!" + "</h3>" + 
        			"<br>" + 
        			applicationContext + 
        			"<br>" + 
        			Arrays.asList(applicationContext) + 
        			"<br>" + 
        			webApplicationContext + 
        			"<br>" + 
        			Arrays.asList(webApplicationContext) + "</div>";
        
        ModelAndView view = new ModelAndView();
        view.addObject("message", message);
        view.setViewName("welcome.html");
        return view;
    }
}
