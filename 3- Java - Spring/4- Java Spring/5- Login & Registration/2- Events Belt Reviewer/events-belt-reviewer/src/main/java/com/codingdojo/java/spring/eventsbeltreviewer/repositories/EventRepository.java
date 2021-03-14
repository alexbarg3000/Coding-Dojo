package com.codingdojo.java.spring.eventsbeltreviewer.repositories;

import java.util.List;

import com.codingdojo.java.spring.eventsbeltreviewer.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends CrudRepository <Event, Long> {
    List <Event> findAll();
}