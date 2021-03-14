package com.codingdojo.java.spring.group_project.repositories;


import com.codingdojo.java.spring.group_project.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    List<Category> findAll();
    List<Category> findCategoryById(long id);
}
