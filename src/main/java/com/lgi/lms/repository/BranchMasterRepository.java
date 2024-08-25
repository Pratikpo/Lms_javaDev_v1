package com.lgi.lms.repository;

import com.lgi.lms.dto.BranchInfoDTO;
import com.lgi.lms.model.Branch_Master;

import java.util.List;
import java.util.Optional;

public interface BranchMasterRepository {
    void save(Branch_Master branch);
    List<BranchInfoDTO> getAllBranchesInfo();
    Optional<BranchInfoDTO> getBranchInfoById(Integer id);
    void updateBranch(BranchInfoDTO branchInfo);
    void deleteBranch(Integer id);

}
