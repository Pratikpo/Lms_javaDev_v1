package com.lgi.lms.repository;

import com.lgi.lms.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    List<Category> findAll();
    Optional<Category> findById(Long id);
    void save(Category category);
    long count();
}
