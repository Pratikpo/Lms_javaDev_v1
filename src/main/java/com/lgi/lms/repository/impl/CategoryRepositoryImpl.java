package com.lgi.lms.repository.impl;

import com.lgi.lms.model.Category;
import com.lgi.lms.model.rowmapper.CategoryRowMapper;
import com.lgi.lms.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CategoryRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Category> findAll() {
        return jdbcTemplate.query("SELECT id, name FROM campaign_category", new CategoryRowMapper());
    }

    @Override
    public Optional<Category> findById(Long id) {
        List<Category> categories = jdbcTemplate.query("SELECT id, name FROM campaign_category WHERE id = ?", new Object[]{id}, new CategoryRowMapper());
        return categories.isEmpty() ? Optional.empty() : Optional.of(categories.get(0));
    }

    @Override
    public void save(Category category) {
        jdbcTemplate.update("INSERT INTO campaign_category (name) VALUES (?)", category.getName());
    }

    @Override
    public long count() {
        return jdbcTemplate.queryForObject("SELECT COUNT(id) FROM campaign_category", Long.class);
    }
}