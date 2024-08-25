package com.lgi.lms.service;

import java.util.List;

import com.lgi.lms.model.InsuranceVerticalMaster;

public interface InsuranceVerticalMasterService {

	   InsuranceVerticalMaster findById(Long id);
		
		List<InsuranceVerticalMaster> findAll();
		
		List<InsuranceVerticalMaster> findAllLeadVertical();
}


