package com.lgi.lms.repository;

import java.util.List;

import com.lgi.lms.dto.Roles;

public interface RolesRepository {
  
	void addRole(Roles role);
	
	List<Roles> findAllRoles();
	 
	Roles findRoleById(Long id);
   
}
