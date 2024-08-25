package com.lgi.lms.repository;

import java.util.List;
import com.lgi.lms.model.InsuranceVerticalMaster;

public interface InsuranceVerticalMasterRepository {

    InsuranceVerticalMaster findById(Long id);
	
	List<InsuranceVerticalMaster> findAll();
	
	List<InsuranceVerticalMaster> findAllInsuranceVerticalMaster();
}
