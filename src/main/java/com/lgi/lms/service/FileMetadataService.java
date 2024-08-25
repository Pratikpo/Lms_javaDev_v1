package com.lgi.lms.service;

import com.lgi.lms.model.FileMetadata;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface FileMetadataService {
    FileMetadata saveFile(Long categoryId, Long subcategoryId, String name, MultipartFile file) throws IOException;
    List<FileMetadata> getAllFiles();
    Optional<FileMetadata> getFileById(Long id);

}
