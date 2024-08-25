package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.model.LanguageCovered;

public class LanguageCoveredRowMapper  implements RowMapper<LanguageCovered>{
	
	 @Override
	    public LanguageCovered mapRow(ResultSet rs, int rowNum) throws SQLException {
		 LanguageCovered languageCovered = new LanguageCovered();
		 languageCovered.setId(rs.getLong("id"));
		 languageCovered.setName(rs.getString("name"));
	        return languageCovered;
	}

}

