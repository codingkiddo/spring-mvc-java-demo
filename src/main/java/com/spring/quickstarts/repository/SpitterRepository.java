package com.spring.quickstarts.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.quickstarts.model.Spitter;

/**
 * Repository interface with operations for {@link Spitter} persistence.
 * @author habuma
 */
public interface SpitterRepository extends JpaRepository<Spitter, Long>, SpitterSweeper {
	  
	Spitter findByUsername(String username);
	
	List<Spitter> findByUsernameOrFullNameLike(String username, String fullName);

}
