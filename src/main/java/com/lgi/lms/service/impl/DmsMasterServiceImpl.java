package com.lgi.lms.service.impl;

import com.lgi.lms.model.DmsMaster;
import com.lgi.lms.model.DmsPolicy;
import com.lgi.lms.repository.DmsMasterRepository;
import com.lgi.lms.service.DmsMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

@Service
public class DmsMasterServiceImpl implements DmsMasterService {
    @Value("${file.upload-dir}")
    private String uploadDir;

    @Autowired
    private DmsMasterRepository dmsMasterRepository;

    @Override
    public void saveDmsMaster(int policyMasterId, String documentGroup, String documentType,
                              MultipartFile file, String dmsComment, int uploadBy) throws IOException {

        // Validate file type
        String contentType = file.getContentType();
        if (!contentType.equals("application/pdf") &&
                !contentType.equals("image/jpeg") &&
                !contentType.equals("image/png")) {
            throw new IllegalArgumentException("Invalid file type. Only PDF, JPEG, and PNG are allowed.");
        }

        // Validate file size
        if (file.getSize() > 25 * 1024 * 1024) { // 25 MB
            throw new IllegalArgumentException("File size exceeds the 25 MB limit.");
        }

        // Generate a unique filename
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        String filePath = uploadDir + File.separator + fileName;

        // Save the file to the specified directory
        File destinationFile = new File(filePath);
        file.transferTo(destinationFile);

        // Fetch policy master details
        DmsPolicy dmsPolicy = dmsMasterRepository.findPolicyMasterById(policyMasterId);

        // Create DmsMaster object
        DmsMaster dmsMaster = new DmsMaster();
        dmsMaster.setPolicyMasterId(policyMasterId);
        dmsMaster.setLeadId(dmsPolicy.getLeadId());
        dmsMaster.setPolicyNumber(dmsPolicy.getPolicyNumber());
        dmsMaster.setDocumentGroup(documentGroup);
        dmsMaster.setDocumentType(documentType);
        dmsMaster.setDocument(fileName); // Store the file name or path
        dmsMaster.setDocumentFile(null); // Set to null
        dmsMaster.setDmsComment(dmsComment);
        dmsMaster.setUploadBy(uploadBy);
        dmsMaster.setUploadOn(new Date());

        // Setting null values for the remaining fields
        dmsMaster.setDocumentEncode(null); // Ensure this is set to null
        dmsMaster.setRequest(null);
        dmsMaster.setStatus(null);
        dmsMaster.setResponse(null);

        // Set the new fields to null
        dmsMaster.setNM_Discounts(null);
        dmsMaster.setNM_Discount(null);
        dmsMaster.setNM_Loadings(null);
        dmsMaster.setNM_Loading(null);

        dmsMaster.setProductType(dmsPolicy.getBiztype()); // Set the product type from biztype

        dmsMasterRepository.saveDmsMaster(dmsMaster);
    }
}
