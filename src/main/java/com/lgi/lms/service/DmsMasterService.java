package com.lgi.lms.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DmsMasterService {
    void saveDmsMaster(int policyMasterId, String documentGroup, String documentType,
                       MultipartFile file, String dmsComment, int uploadBy) throws IOException;
}