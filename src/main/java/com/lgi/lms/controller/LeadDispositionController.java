package com.lgi.lms.controller;

import com.lgi.lms.dto.GetCallLogRequest;
import com.lgi.lms.dto.LeadDispositionDTO;
import com.lgi.lms.service.LeadDispositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lead-dispositions")
public class LeadDispositionController {

    @Autowired
    private LeadDispositionService leadDispositionService;

    @PostMapping("/getCallLog")
    public List<LeadDispositionDTO> getCallLog(@RequestBody GetCallLogRequest request) {
        return leadDispositionService.getLeadDispositions(request.getLeadDetailId(), request.getPolicyMasterId());
    }
}
