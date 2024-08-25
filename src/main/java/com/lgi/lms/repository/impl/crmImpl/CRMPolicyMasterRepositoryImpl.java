package com.lgi.lms.repository.impl.crmImpl;

import com.lgi.lms.model.crm.CRMPolicyMaster;
import com.lgi.lms.repository.crmRepository.CRMPolicyMasterRepository;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public class CRMPolicyMasterRepositoryImpl implements CRMPolicyMasterRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public CRMPolicyMasterRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(CRMPolicyMaster policyMaster) {
        String sql = "INSERT INTO policy_master (customer_address1, customer_address2, customer_address3, " +
                "category, chassis_no, customer_city, claim_amount_total, emailId, engine_no, fuel_type, " +
                "yom, mobile1, mobile2, customer_pincode, total_idv, insured_name, " +
                "policy_Number, total_premium_payable, policy_start_date, biztype, lastyear_ncb, " +
                "product_name, regi_date, regi_no, rto_location, state, make, model, model_variant, " +
                "voluntary_deductable) " +
                "VALUES (:customerAddress1, :customerAddress2, :customerAddress3, :category, :chassisNo, " +
                ":customerCity, :claimAmountTotal, :emailId, :engineNo, :fuelType, :yom, :mobile1, :mobile2, " +
                ":customerPincode, :totalIdv, :insuredName, :policyNumber, " +
                ":totalPremiumPayable, :policyStartDate, :biztype, :lastyearNcb, :productName, :regiDate, " +
                ":regiNo, :rtoLocation, :state, :make, :model, :modelVariant, :voluntaryDeductable)";

        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("customerAddress1", policyMaster.getCustomerAddress1())
                .addValue("customerAddress2", policyMaster.getCustomerAddress2())
                .addValue("customerAddress3", policyMaster.getCustomerAddress3())
                .addValue("category", policyMaster.getCategory())
                .addValue("chassisNo", policyMaster.getChassisNo())
                .addValue("customerCity", policyMaster.getCustomerCity())
                .addValue("claimAmountTotal", policyMaster.getClaimAmountTotal())
                .addValue("emailId", policyMaster.getEmailId())
                .addValue("engineNo", policyMaster.getEngineNo())
                .addValue("fuelType", policyMaster.getFuelType())
                .addValue("yom", policyMaster.getYom())
                .addValue("mobile1", policyMaster.getMobile1())
                .addValue("mobile2", policyMaster.getMobile2())
                .addValue("customerPincode", policyMaster.getCustomerPincode())
                .addValue("totalIdv", policyMaster.getTotalIdv())
                .addValue("insuredName", policyMaster.getInsuredName())
                .addValue("policyNumber", policyMaster.getPolicyNumber())
                .addValue("totalPremiumPayable", policyMaster.getTotalPremiumPayable())
                .addValue("policyStartDate", policyMaster.getPolicyStartDate() != null ? Date.valueOf(policyMaster.getPolicyStartDate()) : null)
                .addValue("biztype", policyMaster.getBiztype())
                .addValue("lastyearNcb", policyMaster.getLastyearNcb())
                .addValue("productName", policyMaster.getProductName())
                .addValue("regiDate", policyMaster.getRegiDate() != null ? Date.valueOf(policyMaster.getRegiDate()) : null)
                .addValue("regiNo", policyMaster.getRegiNo())
                .addValue("rtoLocation", policyMaster.getRtoLocation())
                .addValue("state", policyMaster.getState())
                .addValue("make", policyMaster.getMake())
                .addValue("model", policyMaster.getModel())
                .addValue("modelVariant", policyMaster.getModelVariant())
                .addValue("voluntaryDeductable", policyMaster.getVoluntaryDeductable());

        jdbcTemplate.update(sql, params);
    }
}
