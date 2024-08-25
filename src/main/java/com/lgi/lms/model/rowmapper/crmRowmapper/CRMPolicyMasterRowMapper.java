package com.lgi.lms.model.rowmapper.crmRowmapper;

import com.lgi.lms.model.crm.CRMPolicyMaster;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class CRMPolicyMasterRowMapper implements RowMapper<CRMPolicyMaster> {
    @Override
    public CRMPolicyMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        CRMPolicyMaster policyMaster = new CRMPolicyMaster();
        policyMaster.setId(rs.getLong("id"));
        policyMaster.setCustomerAddress1(rs.getString("customer_address1"));
        policyMaster.setCustomerAddress2(rs.getString("customer_address2"));
        policyMaster.setCustomerAddress3(rs.getString("customer_address3"));
        policyMaster.setCategory(rs.getString("category"));
        policyMaster.setChassisNo(rs.getString("chassis_no"));
        policyMaster.setCustomerCity(rs.getString("customer_city"));
        policyMaster.setClaimAmountTotal(rs.getString("claim_amount_total"));
        policyMaster.setEmailId(rs.getString("emailId"));
        policyMaster.setEngineNo(rs.getString("engine_no"));
        policyMaster.setFuelType(rs.getString("fuel_type"));
        policyMaster.setYom(rs.getString("yom"));
        policyMaster.setMobile1(rs.getString("mobile1"));
        policyMaster.setMobile2(rs.getString("mobile2"));
        policyMaster.setCustomerPincode(rs.getInt("customer_pincode"));

        policyMaster.setTotalIdv(rs.getString("total_idv"));
        policyMaster.setInsuredName(rs.getString("insured_name"));
        policyMaster.setPolicyNumber(rs.getString("policy_Number"));
        policyMaster.setTotalPremiumPayable(rs.getString("total_premium_payable"));
        policyMaster.setPolicyStartDate(rs.getDate("policy_start_date") != null ?
                rs.getDate("policy_start_date").toLocalDate() : null);
        policyMaster.setBiztype(rs.getString("biztype"));
        policyMaster.setLastyearNcb(rs.getString("lastyear_ncb"));
        policyMaster.setProductName(rs.getString("product_name"));
        policyMaster.setRegiDate(rs.getDate("regi_date") != null ?
                rs.getDate("regi_date").toLocalDate() : null);
        policyMaster.setRegiNo(rs.getString("regi_no"));
        policyMaster.setRtoLocation(rs.getString("rto_location"));
        policyMaster.setState(rs.getString("state"));
        policyMaster.setMake(rs.getString("make"));
        policyMaster.setModel(rs.getString("model"));
        policyMaster.setModelVariant(rs.getString("model_variant"));
        policyMaster.setVoluntaryDeductable(rs.getString("voluntary_deductable"));

        return policyMaster;
    }
}
