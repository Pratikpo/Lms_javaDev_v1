package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.Category;
import com.lgi.lms.model.FileMetadata;
import com.lgi.lms.model.SubCategory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FileMetadataRowMapper implements RowMapper<FileMetadata> {
    @Override
    public FileMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
        FileMetadata fileMetadata = new FileMetadata();
        fileMetadata.setId(rs.getLong("id"));
        fileMetadata.setName(rs.getString("name"));
        fileMetadata.setFilePath(rs.getString("file_path"));

        Category category = new Category();
        category.setId(rs.getLong("category_id"));
        category.setName(rs.getString("category_name"));
        fileMetadata.setCategory(category);

        SubCategory subCategory = new SubCategory();
        subCategory.setId(rs.getLong("subcategory_id"));
        subCategory.setName(rs.getString("subcategory_name"));
        fileMetadata.setSubcategory(subCategory);

        return fileMetadata;
    }
}