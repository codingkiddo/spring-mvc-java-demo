package com.spring.quickstarts.repository;

import java.util.List;

import com.spring.quickstarts.model.Spittle;


/**
 * Repository interface with operations for {@link Spittle} persistence.
 * @author habuma
 */
public interface SpittleRepository {

  long count();

  List<Spittle> findRecent();

  List<Spittle> findRecent(int count);

  Spittle findOne(long id);

  Spittle save(Spittle spittle);

  List<Spittle> findBySpitterId(long spitterId);
  
  void delete(long id);

}
