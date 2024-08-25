package com.lgi.lms.model.rowmapper.crmRowmapper;

import com.lgi.lms.model.crm.CRMTwowheelerMaster;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class CRMTwoWheelerMasterRawMapper implements RowMapper<CRMTwowheelerMaster> {
    @Override
    public CRMTwowheelerMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        CRMTwowheelerMaster twowheelerMaster = new CRMTwowheelerMaster();
        twowheelerMaster.setId(rs.getLong("id"));
        twowheelerMaster.setCustomerAddress1(rs.getString("customer_address1"));
        twowheelerMaster.setCustomerAddress2(rs.getString("customer_address2"));
        twowheelerMaster.setCustomerAddress3(rs.getString("customer_address3"));
        twowheelerMaster.setCategory(rs.getString("category"));
        twowheelerMaster.setChassisNo(rs.getString("chassis_no"));
        twowheelerMaster.setCustomerCity(rs.getString("customer_city"));
        twowheelerMaster.setClaimAmountTotal(rs.getString("claim_amount_total"));
        twowheelerMaster.setEmailId(rs.getString("emailId"));
        twowheelerMaster.setEngineNo(rs.getString("engine_no"));
        twowheelerMaster.setFuelType(rs.getString("fuel_type"));
        twowheelerMaster.setYom(rs.getString("yom"));
        twowheelerMaster.setMobile1(rs.getString("mobile1"));
        twowheelerMaster.setMobile2(rs.getString("mobile2"));
        twowheelerMaster.setCustomerPincode(rs.getInt("customer_pincode"));
        twowheelerMaster.setPolicyEndDate(rs.getDate("policy_end_date") != null ?
                rs.getDate("policy_end_date").toLocalDate() : null);
        twowheelerMaster.setTotalIdv(rs.getString("total_idv"));
        twowheelerMaster.setInsuredName(rs.getString("insured_name"));
        twowheelerMaster.setPolicyNumber(rs.getString("policy_Number"));
        twowheelerMaster.setTotalPremiumPayable(rs.getString("total_premium_payable"));
        twowheelerMaster.setPolicyStartDate(rs.getDate("policy_start_date") != null ?
                rs.getDate("policy_start_date").toLocalDate() : null);
        twowheelerMaster.setBiztype(rs.getString("biztype"));
        twowheelerMaster.setRenewalNcb(rs.getString("renewal_ncb"));
        twowheelerMaster.setProductName(rs.getString("product_name"));
        twowheelerMaster.setDateofregistration(rs.getDate("dateofregistration") != null ?
                rs.getDate("dateofregistration").toLocalDate() : null);
        twowheelerMaster.setRegiNo(rs.getString("regi_no"));
        twowheelerMaster.setRtoLocation(rs.getString("rto_location"));
        twowheelerMaster.setState(rs.getString("state"));

        return twowheelerMaster;
    }
}