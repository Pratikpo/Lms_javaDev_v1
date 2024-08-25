package com.lgi.lms.service.impl;

import java.util.List;

import com.lgi.lms.dto.PushLeadExternalRequest;
import com.lgi.lms.dto.PolicyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.lgi.lms.model.PolicyMaster;
import com.lgi.lms.repository.PolicyMasterRepository;
import com.lgi.lms.service.PolicyMasterService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class PolicyMasterServiceImpl implements PolicyMasterService {

    @Autowired
    private PolicyMasterRepository policyMasterRepository;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public PolicyMaster findById(Long id) {
        return policyMasterRepository.findById(id);
    }

    @Override
    public List<PolicyMaster> findAll() {
        return policyMasterRepository.findAll();
    }

    @Override
    @Transactional
    public void createLead(PolicyRequest request) {
        int policyMasterId = policyMasterRepository.createPolicy(request);
        policyMasterRepository.createLead(policyMasterId, request);
    }

    @Override
    public void pushLead(PolicyRequest request) {
            PushLeadExternalRequest externalRequest = new PushLeadExternalRequest();
            externalRequest.setCallId("123456");
            externalRequest.setCustomer_Name(request.getFirstName() + " " + request.getLastName());
            externalRequest.setCustomer_Mobile_No(request.getMobileNumber());
            externalRequest.setTelecaller_User_Id("");
            externalRequest.setLead_Id("123456");
            externalRequest.setCamaign_Id("");
            externalRequest.setCampaign_Name("TEST_CAMP");
            externalRequest.setLead_Type("");
            externalRequest.setPriority("");
            externalRequest.setLead_Created_Date("2024-07-12");

            String url = "https://webdialer-uat.libertyinsurance.in/LeadPushAPI/api/LeadPush";
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");

            HttpEntity<PushLeadExternalRequest> entity = new HttpEntity<>(externalRequest, headers);

            try {
                ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
                if (response.getStatusCode().is2xxSuccessful()) {
                    System.out.println("External API call successful: " + response.getBody());
                } else {
                    System.out.println("External API call failed: " + response.getBody());
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Error calling external API: " + e.toString());
            }
    }

}
