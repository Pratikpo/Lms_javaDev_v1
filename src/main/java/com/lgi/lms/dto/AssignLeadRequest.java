package com.lgi.lms.dto;

import java.util.List;

public class AssignLeadRequest {
    private List<String> leadId;
    private int telecallerId;

    public List<String> getLeadId() {
        return leadId;
    }

    public void setLeadId(List<String> leadId) {
        this.leadId = leadId;
    }

    public int getTelecallerId() {
        return telecallerId;
    }

    public void setTelecallerId(int telecallerId) {
        this.telecallerId = telecallerId;
    }
}
