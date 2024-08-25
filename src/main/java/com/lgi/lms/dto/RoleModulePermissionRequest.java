package com.lgi.lms.dto;

public class RoleModulePermissionRequest {
    private int roleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getModulePermissionIds() {
        return modulePermissionIds;
    }

    public void setModulePermissionIds(String modulePermissionIds) {
        this.modulePermissionIds = modulePermissionIds;
    }

    private String modulePermissionIds;
}
