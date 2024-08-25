package com.lgi.lms.dto;

import java.time.LocalDateTime;

public class Roles {
    private Long   id;
    private String name;
    private String roleDescription;
    private String parentRoleId;
    private String leadVerticalId;
    private String menuId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
   


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
	public String getRoleDescription() {
		return roleDescription;
	}


	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getParentRoleId() {
		return parentRoleId;
	}

	public void setParentRoleId(String parentRoleId) {
		this.parentRoleId = parentRoleId;
	}

	public String getLeadVerticalId() {
		return leadVerticalId;
	}

	public void setLeadVerticalId(String leadVerticalId) {
		this.leadVerticalId = leadVerticalId;
	}

	public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
    
}
