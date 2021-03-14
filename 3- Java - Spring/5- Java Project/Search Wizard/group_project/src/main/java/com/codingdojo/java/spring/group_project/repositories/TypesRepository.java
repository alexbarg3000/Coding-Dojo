package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.Type;
import org.springframework.data.repository.CrudRepository;

public interface TypesRepository extends CrudRepository<Type,Long> {
}
