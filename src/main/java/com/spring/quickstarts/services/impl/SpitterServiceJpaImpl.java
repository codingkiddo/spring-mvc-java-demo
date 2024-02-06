package com.spring.quickstarts.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.quickstarts.model.SpitterJpa;
import com.spring.quickstarts.repository.jpa.SpitterRepositoryJpa;
import com.spring.quickstarts.services.SpitterService;



@Service
@Transactional
public class SpitterServiceJpaImpl implements SpitterService {

	@Autowired
	private SpitterRepositoryJpa spitterRepositoryJpa;
	
	@Override
	public List<SpitterJpa> findAllByEmail() {
//		System.out.println("%%%%%%%%%% -------> " + spitterRepositoryJpa.eliteSweep());
		return spitterRepositoryJpa.findAllByEmail();
	}

	@Override
	public int eliteSweep() {
		return spitterRepositoryJpa.eliteSweep();
	}
}
