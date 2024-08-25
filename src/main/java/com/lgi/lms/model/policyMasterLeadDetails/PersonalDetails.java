package com.lgi.lms.model.policyMasterLeadDetails;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PersonalDetails {
    private String productName;
    private String deviceType;
    private String deviceKeyword;
    private String transactionNumber;
    private String quoteNumber;
    private BigDecimal ownDamagePremiumAmount;
    private LocalDate newPolicyStartDate;
    private LocalDate newPolicyEndDate;
    private String gwp;
    private String currentIndividualHoldings;
    private String noPolicyDeductible;
    private String policyTenure;
    private BigDecimal policyPremium;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceKeyword() {
        return deviceKeyword;
    }

    public void setDeviceKeyword(String deviceKeyword) {
        this.deviceKeyword = deviceKeyword;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public BigDecimal getOwnDamagePremiumAmount() {
        return ownDamagePremiumAmount;
    }

    public void setOwnDamagePremiumAmount(BigDecimal ownDamagePremiumAmount) {
        this.ownDamagePremiumAmount = ownDamagePremiumAmount;
    }

    public LocalDate getNewPolicyStartDate() {
        return newPolicyStartDate;
    }

    public void setNewPolicyStartDate(LocalDate newPolicyStartDate) {
        this.newPolicyStartDate = newPolicyStartDate;
    }

    public LocalDate getNewPolicyEndDate() {
        return newPolicyEndDate;
    }

    public void setNewPolicyEndDate(LocalDate newPolicyEndDate) {
        this.newPolicyEndDate = newPolicyEndDate;
    }

    public String getGwp() {
        return gwp;
    }

    public void setGwp(String gwp) {
        this.gwp = gwp;
    }

    public String getCurrentIndividualHoldings() {
        return currentIndividualHoldings;
    }

    public void setCurrentIndividualHoldings(String currentIndividualHoldings) {
        this.currentIndividualHoldings = currentIndividualHoldings;
    }

    public String getNoPolicyDeductible() {
        return noPolicyDeductible;
    }

    public void setNoPolicyDeductible(String noPolicyDeductible) {
        this.noPolicyDeductible = noPolicyDeductible;
    }

    public String getPolicyTenure() {
        return policyTenure;
    }

    public void setPolicyTenure(String policyTenure) {
        this.policyTenure = policyTenure;
    }

    public BigDecimal getPolicyPremium() {
        return policyPremium;
    }

    public void setPolicyPremium(BigDecimal policyPremium) {
        this.policyPremium = policyPremium;
    }
}