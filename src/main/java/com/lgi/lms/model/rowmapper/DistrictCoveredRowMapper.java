package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.model.DistrictCovered;

public class DistrictCoveredRowMapper implements RowMapper<DistrictCovered> {
	
	 @Override
	    public DistrictCovered mapRow(ResultSet rs, int rowNum) throws SQLException {
		 DistrictCovered districtCovered = new DistrictCovered();
		 districtCovered.setId(rs.getLong("id"));
		 districtCovered.setName(rs.getString("name"));
	        return districtCovered;
	}

}
