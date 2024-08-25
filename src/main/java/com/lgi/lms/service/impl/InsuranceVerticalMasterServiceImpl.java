package com.lgi.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgi.lms.model.InsuranceVerticalMaster;
import com.lgi.lms.repository.InsuranceVerticalMasterRepository;
import com.lgi.lms.service.InsuranceVerticalMasterService;

@Service
public class InsuranceVerticalMasterServiceImpl implements InsuranceVerticalMasterService {

    @Autowired
    private InsuranceVerticalMasterRepository insuranceVerticalMasterRepository;

    @Override
    public List<InsuranceVerticalMaster> findAllLeadVertical() {
        return insuranceVerticalMasterRepository.findAllInsuranceVerticalMaster();

        
    }

    @Override
    public InsuranceVerticalMaster findById(Long id) {
        return insuranceVerticalMasterRepository.findById(id);
    }

    @Override
    public List<InsuranceVerticalMaster> findAll() {
        return insuranceVerticalMasterRepository.findAll();
    }
}
