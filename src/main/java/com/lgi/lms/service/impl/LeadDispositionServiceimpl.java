package com.lgi.lms.service.impl;

import com.lgi.lms.dto.LeadDispositionDTO;
import com.lgi.lms.repository.LeadDispositionRepository;
import com.lgi.lms.service.LeadDispositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadDispositionServiceimpl implements LeadDispositionService {
    @Autowired
    private LeadDispositionRepository leadDispositionRepository;

    @Override
    public List<LeadDispositionDTO> getLeadDispositions(int leadDetailId, int policyMasterId) {
        return leadDispositionRepository.getLeadDispositions(leadDetailId, policyMasterId);
    }
}
