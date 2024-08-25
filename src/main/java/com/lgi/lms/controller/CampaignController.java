package com.lgi.lms.controller;

import com.lgi.lms.model.Category;
import com.lgi.lms.model.FileMetadata;
import com.lgi.lms.model.SubCategory;
import com.lgi.lms.service.CategoryService;
import com.lgi.lms.service.FileMetadataService;
import com.lgi.lms.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/campaign")
public class CampaignController {
    private final CategoryService categoryService;
    private final SubCategoryService subCategoryService;
    private final FileMetadataService fileService;

    @Autowired
    public CampaignController(CategoryService categoryService, SubCategoryService subCategoryService, FileMetadataService fileService) {
        this.categoryService = categoryService;
        this.subCategoryService = subCategoryService;
        this.fileService = fileService;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/categories")
    public ResponseEntity<Category> addCategory(@RequestBody String name) {
        Category newCategory = categoryService.addCategory(name);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCategory);
    }
    @GetMapping("/subCategories")
    public List<SubCategory> getAllSubCategories() {
        return subCategoryService.getAllSubCategories();
    }

    @GetMapping("/subCategories/{id}")
    public ResponseEntity<SubCategory> getSubCategoryById(@PathVariable Long id) {
        return subCategoryService.getSubCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/subCategories")
    public ResponseEntity<SubCategory> addSubCategory(@RequestBody String name) {
        SubCategory newSubCategory = subCategoryService.addSubCategory(name);
        return ResponseEntity.status(HttpStatus.CREATED).body(newSubCategory);
    }
    @PostMapping("/upload")
    public ResponseEntity<FileMetadata> uploadFile(@RequestParam("categoryId") Long categoryId,
                                                   @RequestParam("subcategoryId") Long subcategoryId,
                                                   @RequestParam("name") String name,
                                                   @RequestParam("file") MultipartFile file) {
        try {
            FileMetadata savedFile = fileService.saveFile(categoryId, subcategoryId, name, file);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedFile);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/fileMetadata")
    public ResponseEntity<List<FileMetadata>> getAllFiles() {
        List<FileMetadata> files = fileService.getAllFiles();
        return ResponseEntity.ok(files);
    }

    @GetMapping("/fileMetadata/{id}")
    public ResponseEntity<FileMetadata> getFileById(@PathVariable Long id) {
        return fileService.getFileById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}

