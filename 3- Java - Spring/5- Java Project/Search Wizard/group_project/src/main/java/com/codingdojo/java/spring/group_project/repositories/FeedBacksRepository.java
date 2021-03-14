package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.Feedback;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeedBacksRepository extends CrudRepository<Feedback,Long> {
    List<Feedback> findAll();
}
