package com.spring.quickstarts.repository;

import java.util.List;

import com.spring.quickstarts.model.Spittle;

public interface SpittleRepositoryCustom {

  List<Spittle> findRecent();

  List<Spittle> findRecent(int count);

}