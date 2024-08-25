package com.lgi.lms.controller;

import java.util.List;

import com.lgi.lms.dto.AssignLeadRequest;
import com.lgi.lms.dto.LeadDispositionRequest;
import com.lgi.lms.dto.PolicyRequest;
import com.lgi.lms.service.PolicyMasterService;
import com.lgi.lms.service.PolicyLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lgi.lms.dto.LeadSearchRequest;
import com.lgi.lms.model.PolicyMaster;
import com.lgi.lms.service.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

	@Autowired
	LeadService leadService;

	@Autowired
	private PolicyMasterService policyMasterService;

	@Autowired
	private PolicyLeadService policyService;

	@PostMapping("/search")
	public ResponseEntity<List<PolicyMaster>> getLeadList(@RequestBody LeadSearchRequest leadSearch) {

		try {
			List<PolicyMaster> leads = leadService.findLeadsBySearchCriteria(leadSearch);

			if (leads.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(leads, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/assign")
	public ResponseEntity<String> assignTelecallerForLeads(@RequestBody AssignLeadRequest request) {
		int rowsAffected = leadService.assignTelecallerForLeads(request.getLeadId(), request.getTelecallerId());
		return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);

	}

	@PostMapping("/disposition")
	public ResponseEntity<String> createDisposition(@RequestBody LeadDispositionRequest request) {
		leadService.handleLeadDisposition(request);
		return new ResponseEntity<>("Disposition updated Successfully", HttpStatus.OK);

	}

	@PostMapping("/save")
	public ResponseEntity<String> createLead(@RequestBody PolicyRequest request) {
		policyMasterService.createLead(request);
		policyMasterService.pushLead(request);
		return new ResponseEntity<>("Created Successfully", HttpStatus.OK);
	}

	@GetMapping("/policy-lead/{id}")
	public ResponseEntity<String> getPolicyLeadDetails(@PathVariable Long id) {
		String policyLeadDetails = policyService.getPolicyLeadDetailsById(id);
		if (policyLeadDetails == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(policyLeadDetails);
	}
}
