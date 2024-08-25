package com.lgi.lms.service;



import com.lgi.lms.model.Category;

import java.util.List;
import java.util.Optional;


public interface CategoryService {
    void initCategories();
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category addCategory(String name);
}