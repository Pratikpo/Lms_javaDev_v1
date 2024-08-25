package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.conf.Constants.PolicyStatus;
import com.lgi.lms.model.Lookup;
import com.lgi.lms.model.PolicyMaster;

public class PolicyMasterRowMapper implements RowMapper<PolicyMaster> {

	@Override
	public PolicyMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
		PolicyMaster policyMaster = new PolicyMaster();
		policyMaster.setId(rs.getLong("id"));
		policyMaster.setLeadId(rs.getString("lead_id"));
		policyMaster.setCustomerName(rs.getString("customer_name"));
		policyMaster.setFirstName(rs.getString("first_name"));
		policyMaster.setMiddleName(rs.getString("middle_name"));
		policyMaster.setLastName(rs.getString("last_name"));
		policyMaster.setImdCode(rs.getString("imd_code"));
		
		Lookup tellecaller = new Lookup();
		if(rs.getObject("tellecaller_user_id") != null) {
			tellecaller.setId(rs.getLong("tellecaller_user_id"));
			tellecaller.setLabel(rs.getString("tellecaller_user_fullname"));
		}
		policyMaster.setLeadOwner(tellecaller);
		
		Lookup leadSource = new Lookup();
		leadSource.setId(rs.getLong("source_id"));
		leadSource.setLabel(rs.getString("source_name"));
		policyMaster.setLeadSource(leadSource);
		
		Lookup branch = new Lookup();
		branch.setId(rs.getLong("branch_id"));
		branch.setLabel(rs.getString("branch_name"));
		policyMaster.setBranch(branch);
		
		policyMaster.setPolicyNumber(rs.getString("policy_number"));
		
		Lookup policyStatus = new Lookup();
		policyStatus.setId(rs.getLong("policy_status"));
		
		if(rs.getInt("policy_status") == 1) {
			policyStatus.setLabel(PolicyStatus.Active.getLabel());;
		}else {
			policyStatus.setLabel(PolicyStatus.Inactive.getLabel());;
		}
		policyMaster.setPolicyStatus(policyStatus);
		
//		policyMaster.setPolicyEndDate(rs.getTimestamp("policy_end_date").toLocalDateTime());
		
		policyMaster.setPolicyEndDate(rs.getString("policy_end_date"));
		
		policyMaster.setEmail(rs.getString("emailId"));
		policyMaster.setMobileNumber(rs.getString("mobile1"));
		policyMaster.setLeadType(rs.getString("lead_type"));
		
		Lookup status = new Lookup();
		status.setId(rs.getLong("status_id"));
		status.setLabel(rs.getString("status_label"));
		policyMaster.setStatus(status);
		
		policyMaster.setCreatedOn(rs.getTimestamp("created_on").toLocalDateTime());
		
		Lookup productType = new Lookup();
		productType.setId(rs.getLong("product_type_id"));
		productType.setLabel(rs.getString("product_type"));
		policyMaster.setProductType(productType);
		
		Lookup policyType = new Lookup();
		policyType.setId(rs.getLong("policy_type_id"));
		policyType.setLabel(rs.getString("policy_type"));
		policyMaster.setPolicyType(policyType);
		
		policyMaster.setPremium(rs.getString("premium"));
		policyMaster.setLastInsuranceCompany(rs.getString("last_insurance_copmany"));
		
		Lookup disposition = new Lookup();
		disposition.setId(rs.getLong("lead_disposition_id"));
		disposition.setLabel(rs.getString("disposition_name"));
		policyMaster.setDisposition(disposition);
		
		Lookup subDisposition = new Lookup();
		subDisposition.setId(rs.getLong("lead_sub_disposition_id"));
		subDisposition.setLabel(rs.getString("sub_disposition_name"));
		policyMaster.setSubDisposition(subDisposition);
		
		policyMaster.setLeadDevice(rs.getString("lead_device"));
		policyMaster.setMake(rs.getString("make"));
		policyMaster.setModel(rs.getString("model"));
		policyMaster.setVariant(rs.getString("model_variant"));
		policyMaster.setChassisNumber(rs.getString("chassis_no"));
		policyMaster.setEngineNumber(rs.getString("engine_no"));
		policyMaster.setRegistrationNumber(rs.getString("regi_no"));
		policyMaster.setRegistrationDate(rs.getTimestamp("regi_date").toLocalDateTime());
		policyMaster.setFuelType(rs.getString("fuel_type"));
		policyMaster.setManufacturingYear(rs.getString("manufacturing_year"));
		policyMaster.setManufacturingMonth(rs.getString("manufacturing_month"));
		policyMaster.setRegistrationNumber(rs.getString("regi_number1"));
		policyMaster.setAddOnCovers(rs.getString("ad_on_covers"));
		policyMaster.setUpdatedOn(rs.getTimestamp("last_updated_date_time").toLocalDateTime());
		
		return policyMaster;
	}

}
