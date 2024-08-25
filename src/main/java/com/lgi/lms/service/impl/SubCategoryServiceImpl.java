package com.lgi.lms.service.impl;

import com.lgi.lms.model.SubCategory;
import com.lgi.lms.repository.SubCategoryRepository;
import com.lgi.lms.service.SubCategoryService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
    private final SubCategoryRepository subCategoryRepository;

    @Autowired
    public SubCategoryServiceImpl(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    @PostConstruct
    @Override
    public void initSubCategories() {
        if (subCategoryRepository.count() == 0) {
            subCategoryRepository.save(new SubCategory("Product Brochure"));
            subCategoryRepository.save(new SubCategory("Policy Wordings"));
            subCategoryRepository.save(new SubCategory("Add On Coverage On Brief"));
            subCategoryRepository.save(new SubCategory("Claim Form"));
            subCategoryRepository.save(new SubCategory("Product PPT"));
            subCategoryRepository.save(new SubCategory("Create New"));
        }
    }

    @Override
    public List<SubCategory> getAllSubCategories() {
        return subCategoryRepository.findAll();
    }

    @Override
    public Optional<SubCategory> getSubCategoryById(Long id) {
        return subCategoryRepository.findById(id);
    }

    @Override
    public SubCategory addSubCategory(String name) {
        SubCategory subCategory = new SubCategory(name);
        subCategoryRepository.save(subCategory);
        return subCategory;
    }
}
