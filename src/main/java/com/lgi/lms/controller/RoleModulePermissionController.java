package com.lgi.lms.controller;

import com.lgi.lms.dto.ModuleResponse;
import com.lgi.lms.dto.RoleModulePermissionRequest;
import com.lgi.lms.service.RoleModulePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role-module-permissions")
public class RoleModulePermissionController {

    @Autowired
    private RoleModulePermissionService roleModulePermissionService;

    @PostMapping("/save")
    public ResponseEntity<String> addRoleModulePermission(@RequestBody RoleModulePermissionRequest request) {
        roleModulePermissionService.addRoleModulePermission(request);
        return new ResponseEntity<>("Added Successfully", HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @GetMapping("/getModules")
    public List<ModuleResponse> getAllModulesWithPermissions() {
        return roleModulePermissionService.getAllModulesWithPermissions();
    }
}