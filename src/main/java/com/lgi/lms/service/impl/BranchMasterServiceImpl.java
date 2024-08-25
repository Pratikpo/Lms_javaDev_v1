package com.lgi.lms.service.impl;


import com.lgi.lms.dto.BranchInfoDTO;
import com.lgi.lms.exception.BranchNotFoundException;
import com.lgi.lms.model.Branch_Master;
import com.lgi.lms.repository.BranchMasterRepository;
import com.lgi.lms.service.BranchMasterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchMasterServiceImpl implements BranchMasterService {
    private final BranchMasterRepository branchMasterRepository;

    public BranchMasterServiceImpl(BranchMasterRepository branchMasterRepository) {
        this.branchMasterRepository = branchMasterRepository;
    }

    @Override
    public void addBranch(Branch_Master branch) {
        branchMasterRepository.save(branch);
    }
    @Override
    public List<BranchInfoDTO> getAllBranchesInfo() {
        return branchMasterRepository.getAllBranchesInfo();
    }

    @Override
    public Optional<BranchInfoDTO> getBranchInfoById(Integer id) {
        return branchMasterRepository.getBranchInfoById(id);
    }

    @Override
    public void updateBranch(BranchInfoDTO branchInfo) throws BranchNotFoundException {
        Optional<BranchInfoDTO> existingBranch = branchMasterRepository.getBranchInfoById(branchInfo.getId());
        if (existingBranch.isPresent()) {
            branchMasterRepository.updateBranch(branchInfo);
        } else {
            throw new BranchNotFoundException("Branch with id " + branchInfo.getId() + " not found");
        }
    }
    @Override
    public void deleteBranch(Integer id) throws BranchNotFoundException {
        Optional<BranchInfoDTO> existingBranch = branchMasterRepository.getBranchInfoById(id);
        if (existingBranch.isPresent()) {
            branchMasterRepository.deleteBranch(id);
        } else {
            throw new BranchNotFoundException("Branch with id " + id + " not found");
        }
    }




}