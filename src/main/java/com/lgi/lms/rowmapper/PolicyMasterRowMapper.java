package com.lgi.lms.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.model.PolicyMaster;

public class PolicyMasterRowMapper implements RowMapper<PolicyMaster> {

    @Override
    public PolicyMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        PolicyMaster policyMaster = new PolicyMaster();
        //policyMaster.setPolicyTypeId(rs.getLong("policyTypeId"));
        //policyMaster.setCode(rs.getString("code"));
        //policyMaster.setLabel(rs.getString("label"));
        return policyMaster;
    }
}
