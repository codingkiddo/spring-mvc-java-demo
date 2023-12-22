package com.spring.quickstarts.controllers;




import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

  @RequestMapping(method = GET)
  public String home() {
    return "Welcome Home !!!!";
  }

}
