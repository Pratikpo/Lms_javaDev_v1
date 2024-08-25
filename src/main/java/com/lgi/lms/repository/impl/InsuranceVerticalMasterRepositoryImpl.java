package com.lgi.lms.repository.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.lgi.lms.model.InsuranceVerticalMaster;
import com.lgi.lms.model.LeadVertical;
import com.lgi.lms.model.rowmapper.InsuranceVerticalMasterRowMapper;
import com.lgi.lms.model.rowmapper.LeadVerticalRowMapper;
import com.lgi.lms.repository.InsuranceVerticalMasterRepository;


@Repository
public class InsuranceVerticalMasterRepositoryImpl implements InsuranceVerticalMasterRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

  
 
    public List<LeadVertical> findAllLeadVertical() {
        String sql = "SELECT id, code, label FROM lead_vertical";
        return jdbcTemplate.query(sql, new LeadVerticalRowMapper());
    }


    @Override
    public InsuranceVerticalMaster findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT id, disposition_name  code FROM disposition WHERE id = ?", 
                new Object[]{id}, new InsuranceVerticalMasterRowMapper());
    }

    @Override
    public List<InsuranceVerticalMaster> findAll() {
        return jdbcTemplate.query("SELECT id, disposition_name FROM disposition", 
                new InsuranceVerticalMasterRowMapper());
    }


	@Override
	public List<InsuranceVerticalMaster> findAllInsuranceVerticalMaster() {
	
		return null;
	}
}
