package com.lgi.lms.repository;

import com.lgi.lms.dto.ModuleResponse;
import com.lgi.lms.dto.RoleModulePermissionRequest;

import java.util.List;

public interface RoleModulePermissionRepository {
    void insertRoleModulePermission(RoleModulePermissionRequest request);

    List<ModuleResponse> getAllModulesWithPermissions();
}
