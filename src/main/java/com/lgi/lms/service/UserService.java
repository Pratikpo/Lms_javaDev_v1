package com.lgi.lms.service;

import com.lgi.lms.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getTelecallers();
    Optional<User> authenticate(String email, String password);
    
}
