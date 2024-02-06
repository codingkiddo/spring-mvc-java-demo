package com.spring.quickstarts.services;

import java.util.List;

import com.spring.quickstarts.model.SpitterJpa;

public interface SpitterService {

	List<SpitterJpa> findAllByEmail();

	int eliteSweep();

}
