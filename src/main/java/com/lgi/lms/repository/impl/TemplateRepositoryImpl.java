package com.lgi.lms.repository.impl;

import com.lgi.lms.model.Template;
import com.lgi.lms.model.rowmapper.TemplateRowMapper;
import com.lgi.lms.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Repository
public class TemplateRepositoryImpl implements TemplateRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TemplateRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Template save(Template template) {
        if (template.getId() == null) {
            String sql = "INSERT INTO campaign_template (campaign_name, type, created_on, created_by, active, document_path, campaign_content) VALUES (?, ?, ?, ?, ?, ?, ?)";
            KeyHolder keyHolder = new GeneratedKeyHolder();
            jdbcTemplate.update(connection -> {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, template.getCampaignName());
                ps.setString(2, template.getType().name());
                ps.setTimestamp(3, Timestamp.valueOf(template.getCreatedOn()));
                ps.setString(4, template.getCreatedBy());
                ps.setBoolean(5, template.isActive());
                ps.setString(6, template.getDocumentPath());
                ps.setString(7, template.getCampaignContent());
                return ps;
            }, keyHolder);
            template.setId(keyHolder.getKey().longValue());


            saveDynamicVariables(template);
        } else {
            String sql = "UPDATE campaign_template SET campaign_name = ?, type = ?, created_on = ?, created_by = ?, active = ?, document_path = ?, campaign_content = ? WHERE id = ?";
            jdbcTemplate.update(sql, template.getCampaignName(), template.getType().name(), Timestamp.valueOf(template.getCreatedOn()), template.getCreatedBy(), template.isActive(), template.getDocumentPath(), template.getCampaignContent(), template.getId());

            deleteDynamicVariables(template.getId());
            saveDynamicVariables(template);
        }
        return template;
    }

    private void saveDynamicVariables(Template template) {
        String sql = "INSERT INTO campaign_template_dynamic_variables (template_id, dynamic_variables) VALUES (?, ?)";
        for (String variable : template.getDynamicVariables()) {
            jdbcTemplate.update(sql, template.getId(), variable);
        }
    }

    private void deleteDynamicVariables(Long templateId) {
        String sql = "DELETE FROM campaign_template_dynamic_variables WHERE template_id = ?";
        jdbcTemplate.update(sql, templateId);
    }

    @Override
    public Optional<Template> findById(Long id) {
        try {
            String sql = "SELECT ct.id, ct.campaign_name, ct.type, ct.created_on, ct.created_by, " +
                    "ct.active, ct.document_path, ct.campaign_content, " +
                    "GROUP_CONCAT(ctdv.dynamic_variables) as dynamic_variables " +
                    "FROM campaign_template ct " +
                    "LEFT JOIN campaign_template_dynamic_variables ctdv ON ct.id = ctdv.template_id " +
                    "WHERE ct.id = ? " +
                    "GROUP BY ct.id";
            List<Template> templates = jdbcTemplate.query(sql, new Object[]{id}, new TemplateRowMapper());
            return templates.isEmpty() ? Optional.empty() : Optional.of(templates.get(0));
        } catch (DataAccessException e) {

            return Optional.empty();
        }
    }
    @Override
    public List<Template> findByActiveTrue() {
        String sql = "SELECT ct.id, ct.campaign_name, ct.type, ct.created_on, ct.created_by, " +
                "ct.active, ct.document_path, ct.campaign_content, " +
                "GROUP_CONCAT(ctdv.dynamic_variables) as dynamic_variables " +
                "FROM campaign_template ct " +
                "LEFT JOIN campaign_template_dynamic_variables ctdv ON ct.id = ctdv.template_id " +
                "WHERE ct.active = true " +
                "GROUP BY ct.id";
        return jdbcTemplate.query(sql, new TemplateRowMapper());
    }
    @Override
    public void deleteById(Long id) {
        try {
            String deleteDynamicVarsSql = "DELETE FROM campaign_template_dynamic_variables WHERE template_id = ?";
            String deleteTemplateSql = "DELETE FROM campaign_template WHERE id = ?";

            int dynamicVarsDeleted = jdbcTemplate.update(deleteDynamicVarsSql, id);
            int templateDeleted = jdbcTemplate.update(deleteTemplateSql, id);



            if(templateDeleted == 0) {

            }
        } catch (DataAccessException e) {

            throw new RuntimeException("Failed to delete template", e);
        }
    }

    @Override
    public List<Template> findAll() {
        String sql = "SELECT ct.id, ct.campaign_name, ct.type, ct.created_on, ct.created_by, " +
                "ct.active, ct.document_path, ct.campaign_content, " +
                "GROUP_CONCAT(ctdv.dynamic_variables) as dynamic_variables " +
                "FROM campaign_template ct " +
                "LEFT JOIN campaign_template_dynamic_variables ctdv ON ct.id = ctdv.template_id " +
                "GROUP BY ct.id";
        return jdbcTemplate.query(sql, new TemplateRowMapper());
    }
}