package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.UserDesignation;

public class UserDesignationRowMapper implements RowMapper<UserDesignation> {
	
	 @Override
	    public UserDesignation mapRow(ResultSet rs, int rowNum) throws SQLException {
		 UserDesignation userDesignation = new UserDesignation();
		 userDesignation.setId(rs.getLong("id"));
		 userDesignation.setName(rs.getString("name"));
	        return userDesignation;
	 }
}