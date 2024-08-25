package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.SubCategory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubCategoryRowMapper implements RowMapper<SubCategory> {
    @Override
    public SubCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
        SubCategory subCategory = new SubCategory();
        subCategory.setId(rs.getLong("id"));
        subCategory.setName(rs.getString("name"));
        return subCategory;
    }
}