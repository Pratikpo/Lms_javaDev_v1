package com.lgi.lms.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lgi.lms.dto.Roles;
import com.lgi.lms.model.rowmapper.RolesRowMapper;
import com.lgi.lms.repository.RolesRepository;

@Repository
public class RolesRepositoryImpl implements RolesRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addRole(Roles role) {
        String sql = "INSERT INTO roles (name, role_description, parent_role_id, lead_vertical_id, menu_id, created_at, updated_at) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
        role.getName(), role.getRoleDescription(), role.getParentRoleId(), role.getLeadVerticalId(),
        role.getMenuId(), role.getCreatedAt(), role.getUpdatedAt());
    }
    

    @Override
    public List<Roles> findAllRoles() {
        String sql ="SELECT * FROM roles";
        return jdbcTemplate.query(sql, new RolesRowMapper());
    }

    @Override
    public Roles findRoleById(Long id) {
        String sql = "SELECT * FROM roles WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RolesRowMapper());
    }

}
