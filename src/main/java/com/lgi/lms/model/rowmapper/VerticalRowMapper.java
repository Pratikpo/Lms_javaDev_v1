package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.Vertical;

public class VerticalRowMapper implements RowMapper<Vertical>{
	
	 @Override
	    public Vertical mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Vertical vertical = new Vertical();
		 vertical.setId(rs.getLong("id"));
		 vertical.setName(rs.getString("name"));
	        return vertical;
	}

}
