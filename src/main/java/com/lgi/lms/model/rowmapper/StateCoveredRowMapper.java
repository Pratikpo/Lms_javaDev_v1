 package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.StateCovered;

public class StateCoveredRowMapper implements RowMapper<StateCovered> {
	
	 @Override
	    public StateCovered mapRow(ResultSet rs, int rowNum) throws SQLException {
		 StateCovered stateCovered = new StateCovered();
		 stateCovered.setId(rs.getLong("id"));
		 stateCovered.setName(rs.getString("name"));
	        return stateCovered;
	    }
}