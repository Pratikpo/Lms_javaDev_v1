package com.lgi.lms.repository;

import java.util.List;

import com.lgi.lms.dto.LeadDispositionRequest;
import com.lgi.lms.dto.LeadSearchRequest;
import com.lgi.lms.dto.LeadDispositionRequest;
import com.lgi.lms.model.PolicyMaster;

public interface LeadRepository {
	
	List<PolicyMaster> findLeadsBySearchCriteria(LeadSearchRequest leadSearch);

	int assignTelecallerForLeads(List<String> leadId, int telecallerId);

	int createDisposition(LeadDispositionRequest request);

	int createCallLogs(LeadDispositionRequest request);

	int createDispositionInPolicyMaster(int policyMasterId, int dispositionId);
}
