package com.lgi.lms.service.impl;

import com.lgi.lms.model.Category;
import com.lgi.lms.repository.CategoryRepository;
import com.lgi.lms.service.CategoryService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @PostConstruct
    @Override
    public void initCategories() {
        if (categoryRepository.count() == 0) {
            categoryRepository.save(new Category("Health Insurance"));
            categoryRepository.save(new Category("Motor Insurance"));
            categoryRepository.save(new Category("Miscellaneous"));
        }
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category addCategory(String name) {
        Category category = new Category(name);
        categoryRepository.save(category);
        return category;
    }
}
