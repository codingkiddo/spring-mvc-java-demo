package com.spring.quickstarts.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.quickstarts.model.Spittle;
import com.spring.quickstarts.repository.SpittleRepository;

@RestController
@RequestMapping("/spittles")
public class SpittleController {

	private static final String MAX_LONG_AS_STRING = "9223372036854775807";

	private SpittleRepository spittleRepository;

	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
//			@RequestParam(value = "count", defaultValue = "20") int count) {
//		return spittleRepository.findSpittles(max, count);
//	}

	@RequestMapping(value = "/{spittleId}", method = RequestMethod.GET, produces = {"application/json"})
	public ResponseEntity<Spittle> spittle(@PathVariable("spittleId") long spittleId)  throws SpittleNotFoundException {
		Spittle spittle = spittleRepository.findById(spittleId).orElse(null);
		if (spittle == null) {
			throw new SpittleNotFoundException();
		}
		return new ResponseEntity<Spittle>(spittle, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveSpittle(SpittleForm form, Model model) {
		spittleRepository.save(new Spittle(null, form.getMessage(), new Date()));
		return "redirect:/spittles";
	}

	@ExceptionHandler(DuplicateSpittleException.class)
	public String handleDuplicateSpittle() {
		return "error/duplicate";
	}

}
