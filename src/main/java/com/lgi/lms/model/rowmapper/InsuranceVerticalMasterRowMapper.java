package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.InsuranceVerticalMaster;

public class InsuranceVerticalMasterRowMapper implements RowMapper<InsuranceVerticalMaster> {

    @Override
    public InsuranceVerticalMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
    	
        InsuranceVerticalMaster insuranceVerticalMaster = new InsuranceVerticalMaster();
        
        insuranceVerticalMaster.setId(rs.getLong("id"));
        insuranceVerticalMaster.setName(rs.getString("name"));
        insuranceVerticalMaster.setCode(rs.getString("code"));
        return insuranceVerticalMaster;
    }
}
