package com.lgi.lms.repository;



import com.lgi.lms.model.SubCategory;

import java.util.List;
import java.util.Optional;

public interface SubCategoryRepository {
    List<SubCategory> findAll();
    Optional<SubCategory> findById(Long id);
    void save(SubCategory subCategory);
    long count();
}