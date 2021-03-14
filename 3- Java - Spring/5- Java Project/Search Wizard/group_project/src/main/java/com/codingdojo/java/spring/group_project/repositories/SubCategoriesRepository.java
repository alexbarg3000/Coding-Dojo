package com.codingdojo.java.spring.group_project.repositories;

import com.codingdojo.java.spring.group_project.models.Category;
import com.codingdojo.java.spring.group_project.models.SubCategory;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubCategoriesRepository extends CrudRepository<SubCategory,Long> {
    List<SubCategory> findAll();
    SubCategory findSubCategoryById(Long id);
    List<SubCategory> findSubCategoriesByCategoryContains(Category category);
}
