package com.codingdojo.java.spring.dojosandninjas.repositories;

import com.codingdojo.java.spring.dojosandninjas.models.Dojo;
import com.codingdojo.java.spring.dojosandninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
}

