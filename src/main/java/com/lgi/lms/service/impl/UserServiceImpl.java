package com.lgi.lms.service.impl;


import com.lgi.lms.model.User;
import com.lgi.lms.repository.UserRepository;
import com.lgi.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getTelecallers() {
        List<User> telecallers = userRepository.findTelecallers();
        telecallers.forEach(user -> {
            user.setPassword(null);
            // Fetch lead count for each user
            Integer leadCount = userRepository.getLeadCountForUser(user.getId());
            user.setLeadCount(leadCount);
        });
        return telecallers;
    }

    @Override
    public Optional<User> authenticate(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (password.equals(user.getPassword())) {
                user.setPassword(null);
                List<String> permissions = userRepository.getRoleModulePermissions(user.getRoleId());
                if(permissions != null && permissions.size() > 0) {
                	user.setPermissions(permissions.toArray(new String[0]));
                }
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}