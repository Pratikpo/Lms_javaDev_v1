package com.lgi.lms.service;

import java.util.List;

import com.lgi.lms.dto.Roles;

public interface RolesService {
	
    void addRole(Roles role);
	
	List<Roles> findAllRoles();
	 
	Roles findRoleById(Long id);

}
