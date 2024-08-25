package com.lgi.lms.repository.impl;

import com.lgi.lms.dto.ModuleResponse;
import com.lgi.lms.dto.RoleModulePermissionRequest;
import com.lgi.lms.model.rowmapper.ModuleWithPermissionsRowMapper;
import com.lgi.lms.repository.RoleModulePermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleModulePermissionRepositoryImpl implements RoleModulePermissionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertRoleModulePermission(RoleModulePermissionRequest request) {
        String sql = "INSERT INTO role_module_permission_mapping (role_id, module_permission_ids) VALUES (?, ?)";
        jdbcTemplate.update(sql, request.getRoleId(), request.getModulePermissionIds());
    }

    @Override
    public List<ModuleResponse> getAllModulesWithPermissions() {
        String sql = "SELECT m.id AS moduleId, m.module_name, m.module_code, " +
                "mp.id AS permissionId, mp.permission_name, mp.permission_code " +
                "FROM modules m " +
                "LEFT JOIN module_permissions mp ON m.id = mp.module_id";

        return jdbcTemplate.query(sql, new ModuleWithPermissionsRowMapper());
    }
}
