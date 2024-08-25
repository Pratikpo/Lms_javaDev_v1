package com.lgi.lms.repository.impl;

import com.lgi.lms.dto.LeadDispositionDTO;
import com.lgi.lms.model.rowmapper.LeadDispositionRowMapper;
import com.lgi.lms.repository.LeadDispositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LeadDispositionRepositoryImpl implements LeadDispositionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<LeadDispositionDTO> getLeadDispositions(int leadDetailId, int policyMasterId) {
        String sql = "SELECT " +
                "d.disposition_name AS disposition, " +
                "u.fullname AS telecaller, " +
                "CONCAT(ldd.followup_date, ' ', ldd.followup_time) AS callDateTime, " +
                "sd.label AS subDisposition, " +
                "CONCAT(ldd.followup_date, ' ', ldd.followup_time) AS nextFollowUpDateTime " +
//                "ldd.remark AS recordings " +
                "FROM lead_disposition_details ldd " +
                "LEFT JOIN dispositions d ON ldd.disposition_id = d.id " +
                "LEFT JOIN users u ON ldd.telecaller_user_id = u.id " +
                "LEFT JOIN sub_dispositions sd ON ldd.sub_disposition_id = sd.id " +
                "WHERE ldd.leaddetail_id = ? AND ldd.policy_master_id = ?";

        return jdbcTemplate.query(sql, new Object[]{leadDetailId, policyMasterId}, new LeadDispositionRowMapper());
    }
}
