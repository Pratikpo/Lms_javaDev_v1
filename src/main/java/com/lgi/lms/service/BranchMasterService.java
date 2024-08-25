package com.lgi.lms.service;

import com.lgi.lms.dto.BranchInfoDTO;
import com.lgi.lms.exception.BranchNotFoundException;
import com.lgi.lms.model.Branch_Master;

import java.util.List;
import java.util.Optional;

public interface BranchMasterService {
    void addBranch(Branch_Master branch);

    List<BranchInfoDTO> getAllBranchesInfo();
    Optional<BranchInfoDTO> getBranchInfoById(Integer id);

    void updateBranch(BranchInfoDTO branchInfo) throws BranchNotFoundException;
    void deleteBranch(Integer id) throws BranchNotFoundException;


}