package com.os.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.os.dto.ProductDto;
import com.os.entity.Category;
import com.os.repo.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;


    public void addProduct(ProductDto productDto,Category category){

    }


}
