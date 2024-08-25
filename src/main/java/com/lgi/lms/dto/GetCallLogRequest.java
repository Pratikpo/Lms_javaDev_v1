package com.lgi.lms.dto;

public class GetCallLogRequest {
    private int leadDetailId;
    private int policyMasterId;

    public int getLeadDetailId() {
        return leadDetailId;
    }

    public void setLeadDetailId(int leadDetailId) {
        this.leadDetailId = leadDetailId;
    }

    public int getPolicyMasterId() {
        return policyMasterId;
    }

    public void setPolicyMasterId(int policyMasterId) {
        this.policyMasterId = policyMasterId;
    }
}
