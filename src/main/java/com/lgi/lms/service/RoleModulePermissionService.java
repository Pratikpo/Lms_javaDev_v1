package com.lgi.lms.service;

import com.lgi.lms.dto.ModuleResponse;
import com.lgi.lms.dto.RoleModulePermissionRequest;

import java.util.List;

public interface RoleModulePermissionService {
    void addRoleModulePermission(RoleModulePermissionRequest request);

    List<ModuleResponse> getAllModulesWithPermissions();
}
