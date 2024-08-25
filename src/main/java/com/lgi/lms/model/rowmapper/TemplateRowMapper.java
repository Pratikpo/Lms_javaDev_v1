package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.Template;
import com.lgi.lms.model.TemplateType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashSet;

public class TemplateRowMapper implements RowMapper<Template> {
    @Override
    public Template mapRow(ResultSet rs, int rowNum) throws SQLException {
        Template template = new Template();
        template.setId(rs.getLong("id"));
        template.setCampaignName(rs.getString("campaign_name"));
        template.setType(TemplateType.valueOf(rs.getString("type")));

        Timestamp createdOnTimestamp = rs.getTimestamp("created_on");
        if (createdOnTimestamp != null) {
            template.setCreatedOn(createdOnTimestamp.toLocalDateTime());
        }

        template.setCreatedBy(rs.getString("created_by"));
        template.setActive(rs.getBoolean("active"));
        template.setDocumentPath(rs.getString("document_path"));
        template.setCampaignContent(rs.getString("campaign_content"));

        String dynamicVariables = rs.getString("dynamic_variables");
        if (dynamicVariables != null) {
            template.setDynamicVariables(new HashSet<>(Arrays.asList(dynamicVariables.split(","))));
        } else {
            template.setDynamicVariables(new HashSet<>());
        }

        return template;
    }
}
