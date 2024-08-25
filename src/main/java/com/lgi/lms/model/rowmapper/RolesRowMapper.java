package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.dto.Roles;

public class RolesRowMapper implements RowMapper<Roles> {

    @Override
    public Roles mapRow(ResultSet rs, int rowNum) throws SQLException {
        Roles role = new Roles();
        role.setId(rs.getLong("id"));
        role.setName(rs.getString("name"));
        role.setRoleDescription(rs.getString("role_description"));
        role.setParentRoleId(rs.getString("parent_role_id"));
        role.setLeadVerticalId(rs.getString("lead_vertical_id"));
        role.setMenuId(rs.getString("menu_id"));
        role.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        role.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        return role;
    }
}
