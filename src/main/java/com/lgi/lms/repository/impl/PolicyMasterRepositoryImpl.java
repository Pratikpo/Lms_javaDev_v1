package com.lgi.lms.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.lgi.lms.dto.PolicyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import com.lgi.lms.model.PolicyMaster;
import com.lgi.lms.repository.PolicyMasterRepository;
import com.lgi.lms.rowmapper.PolicyMasterRowMapper;
import java.time.Instant;

@Repository
public class PolicyMasterRepositoryImpl implements PolicyMasterRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public PolicyMaster findById(Long id) {
        String sql = "SELECT * FROM policy_master WHERE policyTypeId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new PolicyMasterRowMapper());
    }

    @Override
    public List<PolicyMaster> findAll() {
        String sql = "SELECT * FROM policy_master";
        return jdbcTemplate.query(sql, new PolicyMasterRowMapper());
    }

    @Override
    public int createPolicy(PolicyRequest request) {

        String sql = "INSERT INTO policy_master (policy_Number, biztype, insured_name, mobile1, emailId, make, model, model_variant, regi_no, chassis_no, engine_no, regi_date, fuel_type, rto_location,lead_id,policy_end_date,yom) " +
                "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,'2024-29-07',?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
//                ps.setString(1, request.getLeadId());
                ps.setString(1, request.getPolicyNumber());
//                ps.setString(3, request.getProductName());
                ps.setString(2, request.getBusinessType());
                ps.setString(3, request.getFirstName() + " " + request.getLastName());
                ps.setString(4, request.getMobileNumber());
                ps.setString(5, request.getEmailAddress());
                ps.setString(6, request.getMake());
                ps.setString(7, request.getModel());
                ps.setString(8, request.getVariant());
                ps.setString(9, request.getRegistrationNumber());
                ps.setString(10, request.getChassisNumber());
                ps.setString(11, request.getEngineNumber());
                ps.setDate(12, java.sql.Date.valueOf(request.getRegistrationDate()));
//                ps.setInt(13, request.getManufacturingMonth());
                ps.setString(13, request.getFuelType());
                ps.setString(14, request.getRto());
                ps.setLong(15, Instant.now().getEpochSecond());
                ps.setString(16, request.getManufacturingYear());
                return ps;
            }
        }, keyHolder);

        return keyHolder.getKey().intValue();
    }

    @Override
    public int createLead(int policyMasterId, PolicyRequest request) {
        String sql = "INSERT INTO lead_details (product_lead_id, insurance_vertical_id, first_name, last_name, last_updated_date_time, product_type_id, policy_type_id, policy_status, last_insurance_copmany, ad_on_covers, manufacturing_month,source_id,publisher_id,campaign_id,vertical_id,branch_id) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,1,1,1,1,1)";

        return jdbcTemplate.update(sql,
                policyMasterId,
                request.getLeadTypeId(),
                request.getFirstName(),
                request.getLastName(),
                new java.sql.Timestamp(new java.util.Date().getTime()),
                request.getProductTypeId(),
                request.getPolicyTypeId(),
                request.getPolicyStatusId(),
                request.getInsuranceCompany(),
                request.getAddOnCovers(),
                request.getManufacturingMonth());
    }
}
