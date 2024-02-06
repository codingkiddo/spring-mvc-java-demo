package com.spring.quickstarts.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.quickstarts.model.Spitter;
import com.spring.quickstarts.model.SpitterJpa;


/**
 * Repository interface with operations for {@link Spitter} persistence.
 * @author habuma
 */
@Repository
public interface SpitterRepositoryJpa extends JpaRepository<SpitterJpa, Long>, SpitterSweeper {

	@Query("select s from SpitterJpa s where s.email like '%habuma.com'")
	List<SpitterJpa> findAllByEmail();
	
	public int eliteSweep();

}
