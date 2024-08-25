package com.lgi.lms.service;

import java.util.List;

import com.lgi.lms.model.Role;

public interface RoleService {

	Role findById(Long id);

	List<Role> findAll();
}
