package com.os.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.os.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
