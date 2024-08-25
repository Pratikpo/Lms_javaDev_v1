package com.lgi.lms.repository;

import java.util.List;

import com.lgi.lms.dto.Users;

public interface UsersRepository {
	
	 void addUser(Users user);
	
	 List<Users> getAllUsers();
	 
	 Users getUserById(Long id);
	List<Users> telecallerByParentId(int parentId);

}
