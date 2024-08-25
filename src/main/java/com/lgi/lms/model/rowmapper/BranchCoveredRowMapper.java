package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.model.BranchCovered;

public class BranchCoveredRowMapper implements RowMapper<BranchCovered> {
	
	
	 @Override
	    public BranchCovered mapRow(ResultSet rs, int rowNum) throws SQLException {
		 BranchCovered branchCovered = new BranchCovered();
		 branchCovered.setId(rs.getLong("id"));
		 branchCovered.setName(rs.getString("name"));
	        return branchCovered;
	}

}

