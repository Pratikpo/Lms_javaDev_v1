package com.lgi.lms.repository;

import com.lgi.lms.model.FileMetadata;

import java.util.List;
import java.util.Optional;

public interface FileMetadataRepository {
    Optional<FileMetadata> findById(Long id);
    void save(FileMetadata fileMetadata);
    List<FileMetadata> findAll();
}
