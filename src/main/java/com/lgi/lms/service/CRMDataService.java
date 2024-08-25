package com.lgi.lms.service;

import com.lgi.lms.dto.InsuranceRequestDTO;
import com.lgi.lms.model.crm.CRMLeadDetails;
import com.lgi.lms.model.crm.CRMPolicyMaster;
import com.lgi.lms.model.crm.CRMTwowheelerMaster;

public interface CRMDataService {
    void processInsuranceData(InsuranceRequestDTO data);
}
