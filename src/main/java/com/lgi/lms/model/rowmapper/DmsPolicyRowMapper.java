package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.DmsPolicy;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DmsPolicyRowMapper implements RowMapper<DmsPolicy> {
    @Override
    public DmsPolicy mapRow(ResultSet rs, int rowNum) throws SQLException {
        DmsPolicy dmsPolicy = new DmsPolicy();
        dmsPolicy.setId(rs.getInt("id"));
        dmsPolicy.setLeadId(rs.getString("lead_id"));
        dmsPolicy.setPolicyNumber(rs.getString("policy_number"));
        dmsPolicy.setBiztype(rs.getString("biztype"));
        return dmsPolicy;
    }
}
