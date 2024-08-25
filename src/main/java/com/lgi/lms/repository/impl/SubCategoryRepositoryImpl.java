package com.lgi.lms.repository.impl;

import com.lgi.lms.model.SubCategory;
import com.lgi.lms.model.rowmapper.SubCategoryRowMapper;
import com.lgi.lms.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SubCategoryRepositoryImpl implements SubCategoryRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SubCategoryRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<SubCategory> findAll() {
        return jdbcTemplate.query("SELECT id, name FROM campaign_sub_category", new SubCategoryRowMapper());
    }

    @Override
    public Optional<SubCategory> findById(Long id) {
        List<SubCategory> subCategories = jdbcTemplate.query("SELECT id, name FROM campaign_sub_category WHERE id = ?", new Object[]{id}, new SubCategoryRowMapper());
        return subCategories.isEmpty() ? Optional.empty() : Optional.of(subCategories.get(0));
    }

    @Override
    public void save(SubCategory subCategory) {
        jdbcTemplate.update("INSERT INTO campaign_sub_category (name) VALUES (?)", subCategory.getName());
    }

    @Override
    public long count() {
        return jdbcTemplate.queryForObject("SELECT COUNT(id) FROM campaign_sub_category", Long.class);
    }
}
