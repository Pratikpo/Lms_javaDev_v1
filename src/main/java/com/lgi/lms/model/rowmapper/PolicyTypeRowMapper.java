package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.model.PolicyType;

public class PolicyTypeRowMapper implements RowMapper<PolicyType> {

	@Override
	public PolicyType mapRow(ResultSet rs, int rowNum) throws SQLException {
		PolicyType policyType = new PolicyType();
		policyType.setId(rs.getLong("policy_type_id"));
		policyType.setCode(rs.getString("code"));
		policyType.setLabel(rs.getString("label"));
		return policyType;
	}

}
