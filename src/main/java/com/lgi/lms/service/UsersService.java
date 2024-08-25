package com.lgi.lms.service;

import java.util.List;

import com.lgi.lms.dto.Users;

public interface UsersService {
	
	void addUser(Users user);
	
	List<Users> getAllUsers();
	
	Users getUserById(Long id);
	List<Users> telecallerByParentId(int parentId);

}
