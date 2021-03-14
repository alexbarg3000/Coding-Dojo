package com.codingdojo.java.spring.driverslicense.repositories;

import com.codingdojo.java.spring.driverslicense.models.License;
import com.codingdojo.java.spring.driverslicense.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findAll();

}
