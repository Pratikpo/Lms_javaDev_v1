package com.lgi.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgi.lms.model.Role;
import com.lgi.lms.repository.RoleRepository;
import com.lgi.lms.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	public Role findById(Long id) {
		return this.roleRepository.findById(id);
	}
	
	public List<Role> findAll(){
		return this.roleRepository.findAll();
	}
}
