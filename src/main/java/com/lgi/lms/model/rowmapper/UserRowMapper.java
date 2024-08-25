package com.lgi.lms.model.rowmapper;




import com.lgi.lms.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setCode(rs.getString("code"));
        user.setFullname(rs.getString("fullname"));
        user.setUsername(rs.getString("username"));
        user.setEmail(rs.getString("email"));
        user.setMobileNo(rs.getString("mobile_no"));
        user.setRoleId(rs.getLong("role_id"));
        user.setPassword(rs.getString("password"));
        user.setActive(rs.getBoolean("is_Active"));
        return user;
    }
}

