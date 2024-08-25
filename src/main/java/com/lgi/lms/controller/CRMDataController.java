package com.lgi.lms.controller;


import com.lgi.lms.dto.InsuranceRequestDTO;
import com.lgi.lms.service.CRMDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class CRMDataController {
    @Autowired
    private  CRMDataService dataService;




    @PostMapping("/submit")
    public ResponseEntity<String> processInsuranceData(@RequestBody InsuranceRequestDTO data) {
        try {
            return ResponseEntity.ok("Data processed successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error processing data: " + e.getMessage());
        }
    }
}