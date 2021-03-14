package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.Address;
import com.codingdojo.java.spring.group_project.models.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City,Long> {
    City findCityByAddresses(Address address);
    List<City> findAll();
}
