package com.lgi.lms.service.impl;

import java.util.List;

import com.lgi.lms.dto.LeadDispositionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lgi.lms.dto.LeadSearchRequest;
import com.lgi.lms.model.PolicyMaster;
import com.lgi.lms.repository.LeadRepository;
import com.lgi.lms.service.LeadService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	LeadRepository leadRepository;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<PolicyMaster> findLeadsBySearchCriteria(LeadSearchRequest leadSearch) {
		
		return leadRepository.findLeadsBySearchCriteria(leadSearch);
	}

	@Override
	public int assignTelecallerForLeads(List<String> leadIds, int telecallerId) {
		return leadRepository.assignTelecallerForLeads(leadIds, telecallerId);
	}

	@Override
	@Transactional
	public void handleLeadDisposition(LeadDispositionRequest request) {
		leadRepository.createDisposition(request);
		leadRepository.createCallLogs(request);
		leadRepository.createDispositionInPolicyMaster(request.getPolicyMasterId(), request.getDispositionId());
	}

}
