package com.spring.quickstarts.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.quickstarts.model.SpitterJpa;
import com.spring.quickstarts.services.SpitterService;

@RestController
@RequestMapping("/spitter")
public class SpitterController {

	@Autowired
	private SpitterService spitterService;

	@RequestMapping(value = "/findAllByEmail", method = GET)
	public List<SpitterJpa> findAllByEmail() {
		return spitterService.findAllByEmail();
	}

	@RequestMapping(value = "/eliteSweep", method = GET)
	public int eliteSweep() {
		return spitterService.eliteSweep();
	}
	
	
}
