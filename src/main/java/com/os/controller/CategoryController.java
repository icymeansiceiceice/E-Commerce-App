package com.os.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.os.config.ApiResponse;
import com.os.entity.Category;
import com.os.services.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;


    @PostMapping("/create")
    public ResponseEntity<ApiResponse> createCategory(@Valid @RequestBody Category category){
        if(Objects.nonNull(category.getCategoryName())){
            return new ResponseEntity<ApiResponse>(new ApiResponse(false,"category already exists"), HttpStatus.CONFLICT);
        }
        categoryService.createCategory(category);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"created the category"), HttpStatus.OK);
    }



}
