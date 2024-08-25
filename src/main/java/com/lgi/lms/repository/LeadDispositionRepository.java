package com.lgi.lms.repository;

import com.lgi.lms.dto.LeadDispositionDTO;

import java.util.List;

public interface LeadDispositionRepository {
    List<LeadDispositionDTO> getLeadDispositions(int leadDetailId, int policyMasterId);
}
