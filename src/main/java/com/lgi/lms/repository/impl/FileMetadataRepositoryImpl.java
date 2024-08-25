package com.lgi.lms.repository.impl;

import com.lgi.lms.model.FileMetadata;
import com.lgi.lms.model.rowmapper.FileMetadataRowMapper;
import com.lgi.lms.repository.FileMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FileMetadataRepositoryImpl implements FileMetadataRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public FileMetadataRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<FileMetadata> findById(Long id) {
        String sql = "SELECT fm.id, fm.name, fm.file_path, " +
                "c.id as category_id, c.name as category_name, " +
                "sc.id as subcategory_id, sc.name as subcategory_name " +
                "FROM file_metadata fm " +
                "JOIN campaign_category c ON fm.category_id = c.id " +
                "JOIN campaign_sub_category sc ON fm.subcategory_id = sc.id " +
                "WHERE fm.id = ?";

        List<FileMetadata> files = jdbcTemplate.query(sql, new Object[]{id}, new FileMetadataRowMapper());
        return files.isEmpty() ? Optional.empty() : Optional.of(files.get(0));
    }

    @Override
    public void save(FileMetadata fileMetadata) {
        String sql = "INSERT INTO file_metadata (name, category_id, subcategory_id, file_path) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                fileMetadata.getName(),
                fileMetadata.getCategory().getId(),
                fileMetadata.getSubcategory().getId(),
                fileMetadata.getFilePath());
    }

    @Override
    public List<FileMetadata> findAll() {
        String sql = "SELECT fm.id, fm.name, fm.file_path, " +
                "c.id as category_id, c.name as category_name, " +
                "sc.id as subcategory_id, sc.name as subcategory_name " +
                "FROM file_metadata fm " +
                "JOIN campaign_category c ON fm.category_id = c.id " +
                "JOIN campaign_sub_category sc ON fm.subcategory_id = sc.id";

        return jdbcTemplate.query(sql, new FileMetadataRowMapper());
    }
}
