package com.lgi.lms.service.impl;

import com.lgi.lms.conf.PolicyLeadDetailsFormatter;
import com.lgi.lms.model.policyMasterLeadDetails.PolicyLeadDetails;
import com.lgi.lms.repository.PolicyLeadRepository;
import com.lgi.lms.service.PolicyLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyLeadServiceImpl implements PolicyLeadService {

    private final PolicyLeadRepository policyLeadRepository;
    private final PolicyLeadDetailsFormatter formatter;

    public PolicyLeadServiceImpl(PolicyLeadRepository policyLeadRepository, PolicyLeadDetailsFormatter formatter) {
        this.policyLeadRepository = policyLeadRepository;
        this.formatter = formatter;
    }

    @Override
    public String getPolicyLeadDetailsById(Long id) {
        PolicyLeadDetails policyLeadDetails = policyLeadRepository.findPolicyLeadById(id);
        if (policyLeadDetails == null) {
            return null; // or throw a custom exception
        }
        return formatter.formatPolicyLeadDetails(policyLeadDetails);
    }
}