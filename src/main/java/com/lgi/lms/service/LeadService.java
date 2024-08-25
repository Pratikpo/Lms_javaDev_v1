package com.lgi.lms.service;

import java.util.List;

import com.lgi.lms.dto.LeadDispositionRequest;
import com.lgi.lms.dto.LeadSearchRequest;
import com.lgi.lms.model.PolicyMaster;
import org.springframework.transaction.annotation.Transactional;

public interface LeadService {

	List<PolicyMaster> findLeadsBySearchCriteria(LeadSearchRequest leadSearch);

	int assignTelecallerForLeads(List<String> leadId, int telecallerId);

	@Transactional
	void handleLeadDisposition(LeadDispositionRequest request);
}
