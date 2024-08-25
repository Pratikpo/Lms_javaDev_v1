package com.lgi.lms.repository.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.lgi.lms.dto.LeadDispositionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lgi.lms.dto.LeadSearchRequest;
import com.lgi.lms.model.PolicyMaster;
import com.lgi.lms.model.rowmapper.PolicyMasterRowMapper;
import com.lgi.lms.repository.LeadRepository;

@Repository
public class LeadRepositoryImpl implements LeadRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<PolicyMaster> findLeadsBySearchCriteria(LeadSearchRequest leadSearch) {
		
		List<Object> params = new ArrayList<>();
		String selectSql = """ 
			select pm.id, pm.lead_id, pm.insured_name as customer_name, ld.first_name, ld.middle_name, ld.last_name,
			pm.agent_code as imd_code, pm.tellecaller_user_id, u.fullname as tellecaller_user_fullname,
			ld.source_id, sm.source_name, ld.branch_id, bm.Name as branch_name, pm.policy_number, ld.policy_status, pm.policy_end_date,
			pm.emailId, pm.mobile1, pm.category as lead_type, pm.status as status_id, st.lable as status_label,
			pm.created_on, ld.product_type_id, pt.label as product_type, ld.policy_type_id, ptm.label as policy_type,
			pm.total_premium_payable as premium, ld.last_insurance_copmany,
			ld.lead_disposition_id, dp.disposition_name, ld.lead_sub_disposition_id, sdp.label as sub_disposition_name,
			ld.lead_device, pm.make, pm.model, pm.model_variant, pm.chassis_no, pm.engine_no, pm.regi_no, pm.regi_date, pm.fuel_type,
			pm.yom as manufacturing_year, ld.manufacturing_month, pm.regi_number1, ld.ad_on_covers, ld.pinned,
			ld.last_updated_date_time
			from policy_master pm
			inner join lead_details ld on ld.product_lead_id = pm.id
			left join users u on u.id = pm.tellecaller_user_id
			inner join source_master sm on sm.id = ld.source_id
			inner join branch_master bm on bm.id = ld.branch_id
			inner join status st on st.id = pm.status
			inner join product_type pt on pt.id = ld.product_type_id
			inner join policy_type_master ptm on ptm.policy_type_id = ld.policy_type_id
			left join dispositions dp on dp.id = ld.lead_disposition_id
			left join sub_dispositions sdp on sdp.id = ld.lead_sub_disposition_id
			where 1 = 1
		""";
		
		StringBuilder whereSql = new StringBuilder(); 
		
		if(leadSearch.getFromDate() != null && leadSearch.getToDate() != null) {
			whereSql.append(" and pm.created_on between ? and ? ");
			params.add(leadSearch.getFromDate());
			params.add(leadSearch.getToDate());
		}
		
		if(leadSearch.getImdCode() != null && !leadSearch.getImdCode().isBlank()) {
			whereSql.append(" and pm.agent_code = ? ");
			params.add(leadSearch.getImdCode().trim());
		}
		
		if(leadSearch.getPolicyTypeId() != null) {
			whereSql.append(" and ld.policy_type_id = ? ");
			params.add(leadSearch.getPolicyTypeId());
		}
		
		if(leadSearch.getBranchId() != null) {
			whereSql.append(" and ld.branch_id = ? ");
			params.add(leadSearch.getBranchId());
		}
		
		if(leadSearch.getLeadType() != null && !leadSearch.getLeadType().isBlank()) {
			whereSql.append(" and pm.category = ? ");
			params.add(leadSearch.getLeadType().trim());
		}
		
		if(leadSearch.getStatusId() != null) {
			whereSql.append(" and pm.status = ? ");
			params.add(leadSearch.getStatusId());
		}
		
		if(leadSearch.getDispositionId() != null) {
			whereSql.append(" and ld.lead_disposition_id = ? ");
			params.add(leadSearch.getDispositionId());
		}
		
		if(leadSearch.getSubDispositionId() != null) {
			whereSql.append(" and ld.lead_sub_disposition_id = ? ");
			params.add(leadSearch.getSubDispositionId());
		}
		
		if(leadSearch.getExpiryDays() != null && leadSearch.getExpiryDays().intValue() > 0) {
			LocalDate today = LocalDate.now();
			LocalDate nextDate = today.plusDays(leadSearch.getExpiryDays().intValue());
			whereSql.append(" and ld.lead_sub_disposition_id between ? and ? ");
			params.add(today);
			params.add(nextDate);
		}
		
		if(leadSearch.getTelecallerUserId() != null) {
			whereSql.append(" and pm.tellecaller_user_id = ? ");
			params.add(leadSearch.getTelecallerUserId());
			
			if(leadSearch.getPinned() != null) {
				whereSql.append(" and ld.pinned = ? ");
				params.add(leadSearch.getPinned());
					
			}
		}
		
		
		if(leadSearch.getSearchValue() != null && !leadSearch.getSearchValue().isBlank() 
				&& leadSearch.getSearchField() != null && !leadSearch.getSearchField().isBlank()) {
			
			String field = leadSearch.getSearchField();
			String value = leadSearch.getSearchValue().trim();
			switch (field) {
				case "leadId": 
					whereSql.append(" and pm.lead_id = ? ");
					params.add(value);
					break;
				
				case "leadOwner": 
					whereSql.append(" and u.fullname like '%").append(value).append("%'");
					break;
					
				case "mobileNo":
					whereSql.append(" and pm.mobile1 = ? ");
					params.add(value);
					break;
					
				case "email":
					whereSql.append(" and pm.emailId = ? ");
					params.add(value);
					break;
				
				case "leadSource":
					whereSql.append(" and sm.source_name = ? ");
					params.add(value);
					break;
					
				case "disposition":	
					whereSql.append(" and dp.disposition_name = ? ");
					params.add(value);
					break;
					
				case "subDisposition":	
					whereSql.append(" and sdp.label = ? ");
					params.add(value);
					break;
					
				case "leadDevice":
					whereSql.append(" and ld.lead_device = ? ");
					params.add(value);
					break;
					
				case "policyNo":
					whereSql.append(" and pm.policy_number = ? ");
					params.add(value);
					break;
					
				case "customerName":
					whereSql.append(" and pm.insured_name like '%").append(value).append("%'");
					break;
				
			}
		}
		
		return jdbcTemplate.query(selectSql + whereSql.toString(), 
				new PolicyMasterRowMapper(), params.toArray());
	}

	@Override
	public int assignTelecallerForLeads(List<String> leadIds, int telecallerId) {
		String sql = "UPDATE policy_master SET tellecaller_user_id = :telecallerId WHERE lead_id IN (:leadIds)";

		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("telecallerId", telecallerId);
		parameters.addValue("leadIds", leadIds);
		return namedParameterJdbcTemplate.update(sql, parameters);
	}

	@Override
	public int createDisposition(LeadDispositionRequest request) {
		String sql = "INSERT INTO lead_disposition_details (leaddetail_id,policy_master_id, lead_type_id, category_id, disposition_id, sub_disposition_id, followup_date, followup_time, remark) " +
				"VALUES ( ? ,?, ?, ?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,
				request.getLeadId(),
				request.getPolicyMasterId(),
				request.getLeadTypeId(),
				request.getCategoryId(),
				request.getDispositionId(),
				request.getSubDispositionId(),
				request.getNexFollowUpDate(),
				request.getNextFollowUpTime(),
				request.getRemark());
	}

	@Override
	public int createCallLogs(LeadDispositionRequest request) {
		String sql = "INSERT INTO call_log (policy_master_id, dispositions_id, sub_dispositions_id, follow_date, follow_time, comment) " +
				"VALUES (?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,
				request.getPolicyMasterId(),
				request.getDispositionId(),
				request.getSubDispositionId(),
				request.getNexFollowUpDate(),
				request.getNextFollowUpTime(),
				request.getRemark());
	}

	@Override
	public int createDispositionInPolicyMaster(int policyMasterId, int dispositionId) {
		String sql = "UPDATE policy_master SET dispositions_id = ? WHERE id = ?";
		return jdbcTemplate.update(sql, dispositionId, policyMasterId);
	}

}
