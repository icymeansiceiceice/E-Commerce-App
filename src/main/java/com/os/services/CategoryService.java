package com.os.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.os.entity.Category;
import com.os.repo.CategoryRepo;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepo categoryRepo;

    public Category readCategory(String name){
        return categoryRepo.findByCategoryName(name);
    }

    public void createCategory(Category category){
        categoryRepo.save(category);
    }




}
