package com.lgi.lms.repository.impl;


import com.lgi.lms.model.User;
import com.lgi.lms.model.rowmapper.UserRowMapper;
import com.lgi.lms.repository.UserRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;



@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findTelecallers() {
        String sql = "SELECT id, code, fullname, username, email, mobile_no, role_id, password, is_active FROM users WHERE role_id = 4";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    @Override
    public Optional<User> findByEmail(String email) {
        String sql = """
        			SELECT id, code, fullname, username, email, mobile_no, role_id, password, is_active 
        			FROM users WHERE email = ? and is_active = 1 and is_deleted = 0
        			""";
        try {
            List<User> users = jdbcTemplate.query(sql, new UserRowMapper(), email);
            return users.isEmpty() ? Optional.empty() : Optional.of(users.get(0));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public Integer getLeadCountForUser(Long userId) {
        String sql = "SELECT COUNT(*) FROM policy_master WHERE tellecaller_user_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, userId);
    }

	@Override
	public List<String> getRoleModulePermissions(Long roleId) {
		String sql = """
				select mp.permission_code
				from module_permissions mp 
				inner join role_module_permission rmp on mp.id = rmp.permission_id and rmp.role_id = ?;
				""";
        return jdbcTemplate.queryForList(sql, String.class, roleId);
	}
    
}
