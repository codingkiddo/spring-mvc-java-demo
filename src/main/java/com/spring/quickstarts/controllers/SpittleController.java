package com.spring.quickstarts.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.quickstarts.model.Spitter;
import com.spring.quickstarts.model.Spittle;

@RestController
@RequestMapping("/spittles")
public class SpittleController {

	private List<Spittle> getSpittles() {
		List<Spittle> spittles = new ArrayList<>();
		
		Spitter spitter1 = new Spitter(1L, "admin", null, "admin", "admin", false, "admin");
		Spitter spitter2 = new Spitter(2L, "user", null, "user", "user", false, "user");
		
		Spittle spittle1 = new Spittle(1L, "message-1", new Date(), spitter1);
		Spittle spittle2 = new Spittle(2L, "message-2", new Date(), spitter2);
		
		spittles.add(spittle1);
		spittles.add(spittle2);
		return spittles;
	}
	
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@PreAuthorize("hasAnyRole({'ROLE_ADMIN', 'ROLE_USER'})")
	@PostFilter( "hasRole('ROLE_ADMIN') || " + "filterObject.spitter.username == principal.username")
	public List<Spittle> getAllSpittles() {
		List<Spittle> spittles = getSpittles();
		return spittles;
	}

}
