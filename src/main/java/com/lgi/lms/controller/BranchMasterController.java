package com.lgi.lms.controller;

import com.lgi.lms.dto.BranchInfoDTO;
import com.lgi.lms.exception.BranchNotFoundException;
import com.lgi.lms.model.Branch_Master;
import com.lgi.lms.service.BranchMasterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branches")
public class BranchMasterController {
    private final BranchMasterService branchMasterService;

    public BranchMasterController(BranchMasterService branchMasterService) {
        this.branchMasterService = branchMasterService;
    }

    @PostMapping("addBranch")
    public ResponseEntity<String> addBranch(@RequestBody Branch_Master branch) {
        try {
            branchMasterService.addBranch(branch);
            return ResponseEntity.ok("Branch added successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error adding branch: " + e.getMessage());
        }
    }
    @GetMapping("list")
    public ResponseEntity<List<BranchInfoDTO>> getAllBranches() {
        List<BranchInfoDTO> branches = branchMasterService.getAllBranchesInfo();
        return ResponseEntity.ok(branches);
    }
    @GetMapping("/list/{id}")
    public ResponseEntity<BranchInfoDTO> getBranchById(@PathVariable("id") Integer id) {
        return branchMasterService.getBranchInfoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("update/{id}")
    public ResponseEntity<String> updateBranch(@PathVariable("id") Integer id, @RequestBody BranchInfoDTO branchInfo) {
        branchInfo.setId(id);
        try {
            branchMasterService.updateBranch(branchInfo);
            return ResponseEntity.ok("Branch updated successfully");
        } catch (BranchNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error updating branch: " + e.getMessage());
        }
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteBranch(@PathVariable("id") Integer id) {
        try {
            branchMasterService.deleteBranch(id);
            return ResponseEntity.ok("Branch deleted successfully");
        } catch (BranchNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error deleting branch: " + e.getMessage());
        }
    }

}
