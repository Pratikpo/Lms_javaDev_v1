package com.lgi.lms.repository;


import com.lgi.lms.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findTelecallers();
    Optional<User> findByEmail(String email);
    Integer getLeadCountForUser(Long userId);
    List<String> getRoleModulePermissions(Long roleId);


}
