package com.spring.quickstarts.repository.jpa.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.spring.quickstarts.repository.jpa.SpitterSweeper;

@Repository
public class SpitterRepositoryJpaImpl implements SpitterSweeper {

	@PersistenceContext(unitName = "spitter")
	private EntityManager em;
	
	public int eliteSweep() {
	  String update = 
	      "UPDATE Spitter spitter " +
	   		"SET spitter.username = 'vinod' " +
	   		"WHERE spitter.username = 'habuma' " +
	   		"AND spitter.id = 1";
		return em.createQuery(update).executeUpdate();
	}
	
}
