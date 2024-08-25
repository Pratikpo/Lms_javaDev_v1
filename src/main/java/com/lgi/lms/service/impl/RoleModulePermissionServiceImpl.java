package com.lgi.lms.service.impl;

import com.lgi.lms.dto.ModuleResponse;
import com.lgi.lms.dto.RoleModulePermissionRequest;
import com.lgi.lms.repository.RoleModulePermissionRepository;
import com.lgi.lms.service.RoleModulePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleModulePermissionServiceImpl implements RoleModulePermissionService {
    @Autowired
    private RoleModulePermissionRepository roleModulePermissionRepository;

    @Override
    public void addRoleModulePermission(RoleModulePermissionRequest request) {
        roleModulePermissionRepository.insertRoleModulePermission(request);
    }

    @Override
    public List<ModuleResponse> getAllModulesWithPermissions() {
        return roleModulePermissionRepository.getAllModulesWithPermissions();
    }
}
