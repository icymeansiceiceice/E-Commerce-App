package com.os.services;

import java.util.List;
import java.util.Optional;

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

    public Optional<Category> readCategory(Integer categoryId) {
		return categoryRepo.findById(categoryId);
	}

    public void createCategory(Category category){
        categoryRepo.save(category);
    }

    public List<Category> listCategories(){
        return categoryRepo.findAll();
    }

    public void updateCategory(int id,Category updateCategory){
        Category category = categoryRepo.findById(id).get();
        Category newCategory = Category.builder().id(category.getId()).categoryName(category.getCategoryName())
                                .description(category.getDescription()).imageUrl(category.getImageUrl()).build();
        categoryRepo.save(newCategory);
    }

}
