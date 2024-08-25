package com.lgi.lms.repository;


import com.lgi.lms.model.policyMasterLeadDetails.PolicyLeadDetails;

public interface PolicyLeadRepository {

    PolicyLeadDetails findPolicyLeadById(Long id);
}