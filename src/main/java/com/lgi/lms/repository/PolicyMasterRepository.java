package com.lgi.lms.repository;

import java.util.List;

import com.lgi.lms.dto.PolicyRequest;
import com.lgi.lms.model.PolicyMaster;

public interface PolicyMasterRepository {

    PolicyMaster findById(Long id);
    
    List<PolicyMaster> findAll();

    int createPolicy(PolicyRequest request);

    int createLead(int policyMasterId, PolicyRequest request);
}
