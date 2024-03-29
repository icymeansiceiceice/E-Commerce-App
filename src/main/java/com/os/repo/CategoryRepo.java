package com.os.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.os.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer>{
    
    Category findByCategoryName(String name);

}
