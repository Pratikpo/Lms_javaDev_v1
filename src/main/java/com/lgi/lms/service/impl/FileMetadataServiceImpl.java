package com.lgi.lms.service.impl;

import com.lgi.lms.model.FileMetadata;
import com.lgi.lms.repository.CategoryRepository;
import com.lgi.lms.repository.FileMetadataRepository;
import com.lgi.lms.repository.SubCategoryRepository;
import com.lgi.lms.service.FileMetadataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FileMetadataServiceImpl implements FileMetadataService {


    @Value("${file.upload-dir}")
    private String uploadDir;

    private final FileMetadataRepository fileMetadataRepository;
    private final CategoryRepository categoryRepository;
    private final SubCategoryRepository subcategoryRepository;

    private static final long MAX_FILE_SIZE = 25 * 1024 * 1024; // 25 MB
    private static final List<String> ALLOWED_EXTENSIONS = Arrays.asList("pdf", "epub");

    public FileMetadataServiceImpl(FileMetadataRepository fileMetadataRepository, CategoryRepository categoryRepository, SubCategoryRepository subcategoryRepository) {

        this.fileMetadataRepository = fileMetadataRepository;
        this.categoryRepository = categoryRepository;
        this.subcategoryRepository = subcategoryRepository;
    }


    @Override
        public FileMetadata saveFile(Long categoryId, Long subcategoryId, String name, MultipartFile file) throws IOException {
            validateFile(file);

            String fileName = generateUniqueFileName(file);
            Path path = Paths.get(uploadDir, fileName);
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

            FileMetadata fileMetadata = new FileMetadata();
            fileMetadata.setName(name);
            fileMetadata.setCategory(categoryRepository.findById(categoryId).orElseThrow(() -> new RuntimeException("Category not found")));
            fileMetadata.setSubcategory(subcategoryRepository.findById(subcategoryId).orElseThrow(() -> new RuntimeException("Subcategory not found")));
            fileMetadata.setFilePath(path.toString());

            fileMetadataRepository.save(fileMetadata);
            return fileMetadata;
        }

        @Override
        public List<FileMetadata> getAllFiles() {
            return fileMetadataRepository.findAll();
        }

        @Override
        public Optional<FileMetadata> getFileById(Long id) {
            return fileMetadataRepository.findById(id);
        }

        private void validateFile(MultipartFile file) {
            if (file.isEmpty()) {
                throw new IllegalArgumentException("File is empty");
            }

            if (file.getSize() > MAX_FILE_SIZE) {
                throw new IllegalArgumentException("File size exceeds the limit of 25 MB");
            }

            String fileExtension = getFileExtension(file.getOriginalFilename());
            if (!ALLOWED_EXTENSIONS.contains(fileExtension.toLowerCase())) {
                throw new IllegalArgumentException("Only PDF and EPUB files are allowed");
            }
        }

        private String generateUniqueFileName(MultipartFile file) {
            String originalFileName = file.getOriginalFilename();
            String fileExtension = getFileExtension(originalFileName);
            return UUID.randomUUID().toString() + "." + fileExtension;
        }

        private String getFileExtension(String fileName) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        }
    }


