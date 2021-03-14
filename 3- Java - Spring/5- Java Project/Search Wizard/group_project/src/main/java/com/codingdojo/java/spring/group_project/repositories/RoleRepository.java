package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.Role;
import com.codingdojo.java.spring.group_project.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role,Long> {

    Role findByName(String name);
    List<Role> findAll();



}
