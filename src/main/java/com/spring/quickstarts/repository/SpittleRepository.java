package com.spring.quickstarts.repository;

import java.util.List;

import com.spring.quickstarts.model.Spittle;


public interface SpittleRepository {

  List<Spittle> findRecentSpittles();

  List<Spittle> findSpittles(long max, int count);
  
  Spittle findOne(long id);

  void save(Spittle spittle);

}
