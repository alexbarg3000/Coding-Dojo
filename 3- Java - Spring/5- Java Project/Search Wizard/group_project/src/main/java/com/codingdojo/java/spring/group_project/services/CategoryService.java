package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.models.Category;
import com.codingdojo.java.spring.group_project.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository catRepo;

    public CategoryService(CategoryRepository catRepo) {
        this.catRepo = catRepo;
    }
    public List<Category> getAllCategories(){
        return catRepo.findAll();
    }

    public void addCategory(Category category){
         catRepo.save(category);
    }
    public Category findCategoryById(Long Id) {
        Optional<Category> check = catRepo.findById(Id);
        if(check.isPresent()) {
            return check.get();
        }
        else {
            return null;
        }
    }
}
