package com.baeldung.spring.configuration.normal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("normal")
public class NormalHelloWorldController {
	@GetMapping(path = "/hello")
    public ModelAndView helloWorld() {
        String message = "<br><div style='text-align:center;'>" + "<h3>Secure " + "Controller" + "</h3></div>";
        ModelAndView view = new ModelAndView();
        view.addObject("message", message);
        view.setViewName("welcome.html");
        return view;
    }
}
