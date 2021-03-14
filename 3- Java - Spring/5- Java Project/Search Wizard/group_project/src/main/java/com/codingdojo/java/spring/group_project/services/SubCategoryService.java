package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.models.Category;
import com.codingdojo.java.spring.group_project.models.SubCategory;
import com.codingdojo.java.spring.group_project.models.SubCategory;
import com.codingdojo.java.spring.group_project.repositories.SubCategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {
    private final SubCategoriesRepository subRepo;

    public SubCategoryService(SubCategoriesRepository subRepo) {

        this.subRepo = subRepo;
    }
    public List<SubCategory> getAllSubs(){
        return subRepo.findAll();
    }
    public SubCategory getSubById(Long id){
        return subRepo.findSubCategoryById(id);
    }
    public List<SubCategory> getAllRelateSubs(Category category){
        return subRepo.findSubCategoriesByCategoryContains(category);
    }
    public void addSubCategory(SubCategory subcategory){
         subRepo.save(subcategory);
    }
}
