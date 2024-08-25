package com.lgi.lms.service;

import com.lgi.lms.dto.LeadDispositionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LeadDispositionService {
    List<LeadDispositionDTO> getLeadDispositions(int leadDetailId, int policyMasterId);
}
