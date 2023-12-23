package com.spring.quickstarts.repository;

import com.spring.quickstarts.model.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}
