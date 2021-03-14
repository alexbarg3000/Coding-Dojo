package com.codingdojo.java.spring.greatideas.repositories;

import java.util.List;

import com.codingdojo.java.spring.greatideas.models.Idea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IdeaRepo extends CrudRepository<Idea, Long>{
    List<Idea> findAll();
}
