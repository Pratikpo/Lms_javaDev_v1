package com.lgi.lms.service;



import com.lgi.lms.model.SubCategory;

import java.util.List;
import java.util.Optional;

public interface SubCategoryService {
    void initSubCategories();
    List<SubCategory> getAllSubCategories();
    Optional<SubCategory> getSubCategoryById(Long id);
    public SubCategory addSubCategory(String name);
}