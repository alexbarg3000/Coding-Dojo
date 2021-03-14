package com.codingdojo.java.spring.eventsbeltreviewer.repositories;

import java.util.List;

import com.codingdojo.java.spring.eventsbeltreviewer.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends CrudRepository <Comment, Long> {
    List <Comment> findAll();
}
