package com.lgi.lms.repository.impl;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.lgi.lms.model.AssignProduct;
import com.lgi.lms.model.Branch;
import com.lgi.lms.model.BranchCovered;
import com.lgi.lms.model.CampaignMaster;
import com.lgi.lms.model.Desposition;
import com.lgi.lms.model.DistrictCovered;
import com.lgi.lms.model.ImdCode;
import com.lgi.lms.model.InsuranceVerticalMaster;
import com.lgi.lms.model.LanguageCovered;
import com.lgi.lms.model.LeadVertical;
import com.lgi.lms.model.PolicyType;
import com.lgi.lms.model.PublisherMaster;
import com.lgi.lms.model.ReportingPerson;
import com.lgi.lms.model.SourceMaster;
import com.lgi.lms.model.StateCovered;
import com.lgi.lms.model.SubDesposition;
import com.lgi.lms.model.Team;
import com.lgi.lms.model.UserDesignation;
import com.lgi.lms.model.Vertical;
import com.lgi.lms.model.rowmapper.AssignProductRowMapper;
import com.lgi.lms.model.rowmapper.BranchCoveredRowMapper;
import com.lgi.lms.model.rowmapper.BranchRowMapper;
import com.lgi.lms.model.rowmapper.CampaignMasterRowMapper;
import com.lgi.lms.model.rowmapper.DespositionRowMapper;
import com.lgi.lms.model.rowmapper.DistrictCoveredRowMapper;
import com.lgi.lms.model.rowmapper.ImdCodeRowMapper;
import com.lgi.lms.model.rowmapper.InsuranceVerticalMasterRowMapper;
import com.lgi.lms.model.rowmapper.LanguageCoveredRowMapper;
import com.lgi.lms.model.rowmapper.LeadVerticalRowMapper;
import com.lgi.lms.model.rowmapper.PolicyTypeRowMapper;
import com.lgi.lms.model.rowmapper.PublisherMasterRowMapper;
import com.lgi.lms.model.rowmapper.ReportingPersonRowMapper;
import com.lgi.lms.model.rowmapper.SourceMasterRowMapper;
import com.lgi.lms.model.rowmapper.StateCoveredRowMapper;
import com.lgi.lms.model.rowmapper.SubDespositionRowMapper;
import com.lgi.lms.model.rowmapper.TeamRowMapper;
import com.lgi.lms.model.rowmapper.UserDesignationRowMapper;
import com.lgi.lms.model.rowmapper.VerticalRowMapper;
import com.lgi.lms.repository.LookupMasterRepository;

@Repository
public class LookupMasterRepositoryImpl implements LookupMasterRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<PolicyType> findAllPolicyType() {
		return jdbcTemplate.query("SELECT policy_type_id, code, label FROM policy_type_master", 
				new PolicyTypeRowMapper());
	}
	
	 @Override
	    public PolicyType findPolicyById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT policy_type_id, code, label  FROM policy_type_master WHERE policy_type_id = ?", 
	                new Object[]{id}, new PolicyTypeRowMapper());
	    }
 
	@Override
	public List<LeadVertical> findAllLeadVertical() {
		return jdbcTemplate.query("SELECT id, code, name FROM lead_vertical", 
				new LeadVerticalRowMapper());
	}
	
	@Override
	public List<SourceMaster> findAllSourceMaster() {
		return jdbcTemplate.query("SELECT id, source_name, status, created_on FROM source_master", 
				new SourceMasterRowMapper());
   }
	
	 @Override
	 public SourceMaster findSourceById(Long id) {
	     return jdbcTemplate.queryForObject("SELECT id, source_name, status, created_on FROM source_master WHERE id = ?", 
	            new Object[]{id}, new SourceMasterRowMapper());
	    }
	
	@Override
	public List<PublisherMaster> findAllPublisherMaster() {
		String sql = """
			SELECT pm.id, pm.publisher_name, pm.created_on, 
			sm.id as source_id, sm.source_name 
			FROM publisher_master pm 
			inner join source_master sm on sm.id = pm.source_id
		""";
		return jdbcTemplate.query(sql, 
				new PublisherMasterRowMapper());
    }
	
	 @Override
	    public PublisherMaster findPublisherById(Long id) {
		 String sql = """
					SELECT pm.id, pm.publisher_name, pm.created_on, 
					sm.id as source_id, sm.source_name 
					FROM publisher_master pm 
					inner join source_master sm on sm.id = pm.source_id WHERE pm.id = ?
				""";
		 return jdbcTemplate.queryForObject(sql,new Object[]{id}, new PublisherMasterRowMapper()); 
	    }
	
	 @Override
	    public List<PublisherMaster> findAllPublisherMasterBySourceId(Long id) {
		 String sql = """
					SELECT pm.id, pm.publisher_name, pm.created_on, 
					sm.id as source_id, sm.source_name 
					FROM publisher_master pm 
					inner join source_master sm on sm.id = pm.source_id WHERE pm.source_id = ?
				""";
		 return jdbcTemplate.query(sql,new Object[]{id}, new PublisherMasterRowMapper()); 
	    }
	 
	@Override
	public List<CampaignMaster> findAllCampaignMaster() {
		String sql = """
			SELECT cm.id, cm.campaign_name, cm.created_on, pm.id as publisher_id, pm.publisher_name, sm.id as source_id, sm.source_name 
FROM campaign_master cm
inner join source_master sm on cm.source_id = sm.id
inner join publisher_master pm on cm.publisher_id =pm.id
		""";
		return jdbcTemplate.query(sql, 
				new CampaignMasterRowMapper());
    }
	
	 @Override
	    public CampaignMaster findCampaignById(Long id) {
		 String sql = """
					SELECT cm.id, cm.campaign_name, cm.created_on, pm.id as publisher_id, pm.publisher_name, sm.id as source_id, sm.source_name 
FROM campaign_master cm
inner join source_master sm on cm.source_id = sm.id
inner join publisher_master pm on cm.publisher_id =pm.id WHERE cm.id = ?
				""";
		 return jdbcTemplate.queryForObject(sql,new Object[]{id}, new CampaignMasterRowMapper()); 	
	    }
	
	
	 @Override
	    public List<CampaignMaster>  findAllCampaignMasterListBySourcePublisherId(Long id,Long subId) {
		 String sql = """
					SELECT cm.id, cm.campaign_name, cm.created_on, pm.id as publisher_id, pm.publisher_name, sm.id as source_id, sm.source_name 
FROM campaign_master cm
inner join source_master sm on cm.source_id = sm.id
inner join publisher_master pm on cm.publisher_id =pm.id WHERE cm.source_id = ? AND cm.publisher_id = ? 
				""";
		 return jdbcTemplate.query(sql,new Object[]{id,subId}, new CampaignMasterRowMapper()); 	
	    }
	
	 
	@Override
	public List<Desposition> findAllDesposition() {
		return jdbcTemplate.query("SELECT id, disposition_name AS name FROM dispositions", 
				new DespositionRowMapper());
   }
	
	 @Override
	    public Desposition findDespositionById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, disposition_name AS name FROM dispositions WHERE id = ?", 
	                new Object[]{id}, new DespositionRowMapper());
	    }
	
	@Override
	public List<SubDesposition> findAllSubDesposition() {
		return jdbcTemplate.query("SELECT id, dispositions_id, label FROM sub_dispositions", 
				new SubDespositionRowMapper());
   }
	
	 @Override
	    public SubDesposition findSubDespositionById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, dispositions_id, label FROM sub_dispositions WHERE id = ?", 
	        		new Object[]{id}, new SubDespositionRowMapper());
	 }
	 
	 @Override
		public List<SubDesposition> findAllDespositionByDispositionID(Long id) {
			String sql = "SELECT id, dispositions_id, label FROM sub_dispositions WHERE dispositions_id = ?";
			return jdbcTemplate.query(sql, new Object[]{id}, new SubDespositionRowMapper());
		}

	 
	        
	@Override
	public List<Branch> findAllBranch() {
		return jdbcTemplate.query("SELECT id, BranchID as branch_id, name FROM branch_master", 
				new BranchRowMapper());
   }
	
	 @Override
	    public Branch findBranchById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, BranchID as branch_id, name FROM branch_master WHERE id = ?", 
	        		new Object[]{id}, new BranchRowMapper());
	 }
	 
	 @Override
		public List<UserDesignation> findAllUserDesignation() {
			return jdbcTemplate.query("SELECT id, name FROM roles", 
					new UserDesignationRowMapper());
	   }
	 
	 @Override
	    public UserDesignation findUserDesignationById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, name FROM roles WHERE id = ?", 
	        		new Object[]{id}, new UserDesignationRowMapper());
	 }
	 
	 @Override
		public List<UserDesignation> findAllUserDesignationByVerticleID(Long id) {
	        return jdbcTemplate.query("SELECT id, name FROM roles WHERE lead_vertical_id = ?",
	        		new Object[]{id}, new UserDesignationRowMapper());
	   }
	 
	 
	 @Override
		public List<Vertical> findAllVertical() {
			return jdbcTemplate.query("SELECT id, name FROM lead_vertical", 
					new VerticalRowMapper());
	   }
	 
	 @Override
	    public Vertical findVerticalById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, name FROM lead_vertical WHERE id = ?", 
	        		new Object[]{id}, new VerticalRowMapper());
	 }
	 
	 @Override
	    public List<InsuranceVerticalMaster> findAllInsuranceVerticalMaster() {
	        return jdbcTemplate.query("SELECT id, name, code FROM insurance_vertical_master", 
	                new InsuranceVerticalMasterRowMapper());
	 }
	 
	 @Override
	    public InsuranceVerticalMaster findInsuranceVerticalMasterById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, name, code FROM insurance_vertical_master WHERE id = ?",
	                new Object[]{id}, new InsuranceVerticalMasterRowMapper());
	    }
	 
	 @Override
		public List<StateCovered> findAllStateCovered() {
			return jdbcTemplate.query("SELECT id, state_cleaned As name FROM state_master", 
					new StateCoveredRowMapper());
	   }
	 
	 @Override
	    public StateCovered findStateCoveredById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id,state_cleaned As name FROM state_master WHERE id = ?", 
	        		new Object[]{id}, new StateCoveredRowMapper());
	 }
	 
	 @Override
		public List<LanguageCovered> findAllLanguageCovered() {
			return jdbcTemplate.query("SELECT id, name FROM language_master", 
					new LanguageCoveredRowMapper());
	   }
	 
	 @Override
	    public LanguageCovered findLanguageCoveredById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, name FROM language_master WHERE id = ?", 
	        		new Object[]{id}, new LanguageCoveredRowMapper());
	 }
	 
	 @Override
		public List<DistrictCovered> findAllDistrictCovered() {
			return jdbcTemplate.query("SELECT id, name FROM city_master", 
					new DistrictCoveredRowMapper());
	   }
	 
	 @Override
	    public DistrictCovered findDistrictCoveredById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, name FROM city_master WHERE id = ?", 
	        		new Object[]{id}, new DistrictCoveredRowMapper());
	 }
	 
	 @Override
	    public List<DistrictCovered> findDistrictsByStateId(Long stateId) {
	        String sql = "SELECT id, name FROM city_master WHERE state_id = ?";
	        return jdbcTemplate.query(sql, new Object[]{stateId}, new DistrictCoveredRowMapper());
	    }
	 
	 @Override
		public List<BranchCovered> findAllBranchCovered() {
			return jdbcTemplate.query("SELECT id, name FROM branch_master", 
					new BranchCoveredRowMapper());
	   }
	 
	 @Override
	    public BranchCovered findBranchCoveredById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, name FROM branch_master WHERE id = ?", 
	        		new Object[]{id}, new BranchCoveredRowMapper());
	 }
	 
	 @Override
	    public List<BranchCovered> findAllBranchByDistrictStateId(Long districtStateId) {
	        String sql = "SELECT id, name FROM branch_master where district_id = ?";
	        return jdbcTemplate.query(sql, new Object[]{districtStateId}, new BranchCoveredRowMapper());
	    }
	
	 @Override
		public List<Team> findAllTeam() {
			return jdbcTemplate.query("SELECT id, name FROM team_master", 
					new TeamRowMapper());
	   }
	 
	 @Override
	    public Team findTeamById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, name FROM team_master WHERE id = ?", 
	        		new Object[]{id}, new TeamRowMapper());
	 }
	 
	 @Override
		public List<ReportingPerson> findAllReportingPerson() {
			return jdbcTemplate.query("SELECT id, fullname FROM users", 
					new ReportingPersonRowMapper());
	   }
	 
	 @Override
	    public ReportingPerson findReportingPersonById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, fullname FROM users WHERE id = ?", 
	        		new Object[]{id}, new ReportingPersonRowMapper());
	 }
	 
	 @Override
		public List<ReportingPerson> findAllReportingPersonByRoleId(Long id) {
		  String sql = "SELECT id, fullname FROM users WHERE role_id = ?";
	        return jdbcTemplate.query(sql, new Object[]{id}, new ReportingPersonRowMapper());
	    }
	 
	 
	 @Override
		public List<ImdCode> findAllImdCode() {
			return jdbcTemplate.query("SELECT id, agent_code AS imd_code FROM agent_master", 
					new ImdCodeRowMapper());
	   }
	 
	 @Override
	    public ImdCode findImdCodeById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, agent_code AS imd_code FROM agent_master WHERE id = ?", 
	        		new Object[]{id}, new ImdCodeRowMapper());
	 }
	 
	 @Override
		public List<AssignProduct> findAllAssignProduct() {
			return jdbcTemplate.query("SELECT id, name AS assign_product FROM insurance_vertical_master", 
					new AssignProductRowMapper());
	   }
	 
	 @Override
	    public AssignProduct findAssignProductById(Long id) {
	        return jdbcTemplate.queryForObject("SELECT id, name AS assign_product FROM insurance_vertical_master WHERE id = ?", 
	        		new Object[]{id}, new AssignProductRowMapper());
	 }
	 
}
	