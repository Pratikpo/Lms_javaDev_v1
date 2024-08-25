package com.lgi.lms.service;

import java.util.List;

import com.lgi.lms.dto.PolicyRequest;
import com.lgi.lms.model.PolicyMaster;
import org.springframework.transaction.annotation.Transactional;

public interface PolicyMasterService {

    PolicyMaster findById(Long id);
    
    List<PolicyMaster> findAll();

    @Transactional
    void createLead(PolicyRequest request);

    void pushLead(PolicyRequest request);
}
