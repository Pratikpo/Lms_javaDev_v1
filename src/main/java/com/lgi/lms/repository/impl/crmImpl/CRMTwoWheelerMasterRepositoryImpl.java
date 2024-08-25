package com.lgi.lms.repository.impl.crmImpl;

import com.lgi.lms.model.crm.CRMTwowheelerMaster;
import com.lgi.lms.repository.crmRepository.CRMTwoWheelerMasterRepository;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CRMTwoWheelerMasterRepositoryImpl implements CRMTwoWheelerMasterRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public CRMTwoWheelerMasterRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void save(CRMTwowheelerMaster twowheelerMaster) {
        String sql = "INSERT INTO twowheeler_master (" +
                "customer_address1, customer_address2, customer_address3, category, " +
                "chassis_no, customer_city, claim_amount_total, emailId, engine_no, " +
                "fuel_type, yom, mobile1, mobile2, customer_pincode, policy_end_date, " +
                "total_idv, insured_name, policy_Number, total_premium_payable, " +
                "policy_start_date, biztype, renewal_ncb, product_name, dateofregistration, " +
                "regi_no, rto_location, state) " +
                "VALUES (" +
                ":customerAddress1, :customerAddress2, :customerAddress3, :category, " +
                ":chassisNo, :customerCity, :claimAmountTotal, :emailId, :engineNo, " +
                ":fuelType, :yom, :mobile1, :mobile2, :customerPincode, :policyEndDate, " +
                ":totalIdv, :insuredName, :policyNumber, :totalPremiumPayable, " +
                ":policyStartDate, :biztype, :renewalNcb, :productName, :dateofregistration, " +
                ":regiNo, :rtoLocation, :state)";

        jdbcTemplate.update(sql, new BeanPropertySqlParameterSource(twowheelerMaster));
    }
}
