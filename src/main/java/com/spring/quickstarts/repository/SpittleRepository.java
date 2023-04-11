package com.spring.quickstarts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.quickstarts.model.Spittle;

/**
 * Repository interface with operations for {@link Spittle} persistence.
 * @author habuma
 */
public interface SpittleRepository extends JpaRepository<Spittle, Long>, SpittleRepositoryCustom {
  
  List<Spittle> findBySpitterId(long spitterId);
  
}
