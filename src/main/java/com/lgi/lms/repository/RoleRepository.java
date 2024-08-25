package com.lgi.lms.repository;

import java.util.List;

import com.lgi.lms.model.Role;

public interface RoleRepository {

	Role findById(Long id);
	
	List<Role> findAll();
}
