package com.spring.quickstarts.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@Secured({"ROLE_ADMIN"})
	@RequestMapping("/admin")
	public String showAdminPage() {
		return "admin";
	}
}
