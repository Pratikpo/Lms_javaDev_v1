package com.lgi.lms.dto;

import java.sql.Time;
import java.util.Date;

public class LeadDispositionRequest {
    private int leadTypeId;
    private int policyMasterId;
    private int categoryId;
    private int dispositionId;

    public int getLeadId() {
        return leadId;
    }

    public void setLeadId(int leadId) {
        this.leadId = leadId;
    }

    private int leadId;

    public int getLeadTypeId() {
        return leadTypeId;
    }

    public void setLeadTypeId(int leadTypeId) {
        this.leadTypeId = leadTypeId;
    }

    public int getPolicyMasterId() {
        return policyMasterId;
    }

    public void setPolicyMasterId(int policyMasterId) {
        this.policyMasterId = policyMasterId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getDispositionId() {
        return dispositionId;
    }

    public void setDispositionId(int dispositionId) {
        this.dispositionId = dispositionId;
    }

    public int getSubDispositionId() {
        return subDispositionId;
    }

    public void setSubDispositionId(int subDispositionId) {
        this.subDispositionId = subDispositionId;
    }

    public Date getNexFollowUpDate() {
        return nexFollowUpDate;
    }

    public void setNexFollowUpDate(Date nexFollowUpDate) {
        this.nexFollowUpDate = nexFollowUpDate;
    }

    public String getNextFollowUpTime() {
        return nextFollowUpTime;
    }

    public void setNextFollowUpTime(String nextFollowUpTime) {
        this.nextFollowUpTime = nextFollowUpTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private int subDispositionId;
    private Date nexFollowUpDate;
    private String nextFollowUpTime;
    private String remark;

}