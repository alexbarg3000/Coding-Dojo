package com.codingdojo.java.spring.dojosandninjas.repositories;

import com.codingdojo.java.spring.dojosandninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
    //find list of all dojos
    List<Dojo> findAll();
}
