package com.lgi.lms.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgi.lms.dto.Roles;
import com.lgi.lms.repository.RolesRepository;
import com.lgi.lms.service.RolesService;

@Service
public class RolesServiceImpl  implements RolesService {
	
	
	@Autowired
    private RolesRepository rolesRepository;

    @Override
    public void addRole(Roles role) {
        role.setCreatedAt(LocalDateTime.now());
        role.setUpdatedAt(LocalDateTime.now());
        rolesRepository.addRole(role);
    }
    
    @Override
    public List<Roles> findAllRoles() {
        return rolesRepository.findAllRoles();
    }
    
    @Override
    public Roles findRoleById(Long id) {
        return rolesRepository.findRoleById(id);
    }
}
