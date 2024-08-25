package com.lgi.lms.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgi.lms.dto.Users;
import com.lgi.lms.repository.UsersRepository;
import com.lgi.lms.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	 @Autowired
	 private UsersRepository usersRepository;
		
		 @Override
		  public void addUser(Users user) {
		       
		  LocalDateTime now = LocalDateTime.now();
		  user.setCreatedAt(now);
		  user.setUpdatedAt(now);
		      
		  usersRepository.addUser(user);
	 }
		 
		 @Override
	     public List<Users> getAllUsers() {
		 return usersRepository.getAllUsers();
		 
		 }
		 
		 @Override
		 public Users getUserById(Long id) {
		 return usersRepository.getUserById(id);
	}
	@Override
	public List<Users> telecallerByParentId(int parentId) {
		return usersRepository.telecallerByParentId(parentId);
	}
}
