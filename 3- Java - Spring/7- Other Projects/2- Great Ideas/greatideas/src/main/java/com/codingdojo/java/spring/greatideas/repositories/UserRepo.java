package com.codingdojo.java.spring.greatideas.repositories;

import java.util.List;

import com.codingdojo.java.spring.greatideas.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends CrudRepository<User, Long>{
    List<User> findAll();
    User findByEmail(String email);
}