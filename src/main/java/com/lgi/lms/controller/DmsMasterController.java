package com.lgi.lms.controller;

import com.lgi.lms.service.DmsMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/dms")
public class DmsMasterController {

    @Autowired
    private DmsMasterService dmsMasterService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadDocument(
            @RequestParam int policyMasterId,
            @RequestParam String documentGroup,
            @RequestParam String documentType,
            @RequestParam MultipartFile file,
            @RequestParam String dmsComment,
            @RequestParam int uploadBy) {

        try {
            dmsMasterService.saveDmsMaster(policyMasterId, documentGroup, documentType, file, dmsComment, uploadBy);
            return ResponseEntity.ok("Document uploaded successfully");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error reading file");
        }
    }
}
