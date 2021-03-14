package com.codingdojo.java.spring.countries.repositories;

import java.util.List;

import com.codingdojo.java.spring.countries.models.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CityRepository extends CrudRepository <City, Long>{
    List <City> findAll();

    @Query("select ci.name, ci.population from City ci " +
            "join ci.country c where c.name = 'Mexico' and ci.population > '500000'")
    List <Object []> findByName();
}
