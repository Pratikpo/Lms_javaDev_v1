package com.lgi.lms.model.policyMasterLeadDetails;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PreviousPolicyDetails {
    private String previousPolicyNumber;
    private LocalDate previousPolicyExpiryDate;
    private BigDecimal previousPolicyPremiumAmount;
    private String noPreviousPolicyStartDate;
    private String previousPolicyEndDate;

    public String getPreviousPolicyNumber() {
        return previousPolicyNumber;
    }

    public void setPreviousPolicyNumber(String previousPolicyNumber) {
        this.previousPolicyNumber = previousPolicyNumber;
    }

    public LocalDate getPreviousPolicyExpiryDate() {
        return previousPolicyExpiryDate;
    }

    public void setPreviousPolicyExpiryDate(LocalDate previousPolicyExpiryDate) {
        this.previousPolicyExpiryDate = previousPolicyExpiryDate;
    }

    public BigDecimal getPreviousPolicyPremiumAmount() {
        return previousPolicyPremiumAmount;
    }

    public void setPreviousPolicyPremiumAmount(BigDecimal previousPolicyPremiumAmount) {
        this.previousPolicyPremiumAmount = previousPolicyPremiumAmount;
    }

    public String getNoPreviousPolicyStartDate() {
        return noPreviousPolicyStartDate;
    }

    public void setNoPreviousPolicyStartDate(String noPreviousPolicyStartDate) {
        this.noPreviousPolicyStartDate = noPreviousPolicyStartDate;
    }

    public String getPreviousPolicyEndDate() {
        return previousPolicyEndDate;
    }

    public void setPreviousPolicyEndDate(String previousPolicyEndDate) {
        this.previousPolicyEndDate = previousPolicyEndDate;
    }
}