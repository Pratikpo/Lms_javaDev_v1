package com.lgi.lms.model.policyMasterLeadDetails;

import java.time.LocalDateTime;

public class LeadDetails {

    private String campaignSource;
    private String duplicateLead;
    private String preventedDuplication;
    private String expiredLeads;
    private LocalDateTime lastDisposedOn;
    private String utmUrl;
    private String unsubscribeUrl;
    private String serviceRequests;
    private String servicePreference;
    private String indicatorCallReferenceId;
    private String dealerCampaignOwner;

    public String getCampaignSource() {
        return campaignSource;
    }

    public void setCampaignSource(String campaignSource) {
        this.campaignSource = campaignSource;
    }

    public String getDuplicateLead() {
        return duplicateLead;
    }

    public void setDuplicateLead(String duplicateLead) {
        this.duplicateLead = duplicateLead;
    }

    public String getPreventedDuplication() {
        return preventedDuplication;
    }

    public void setPreventedDuplication(String preventedDuplication) {
        this.preventedDuplication = preventedDuplication;
    }

    public String getExpiredLeads() {
        return expiredLeads;
    }

    public void setExpiredLeads(String expiredLeads) {
        this.expiredLeads = expiredLeads;
    }

    public LocalDateTime getLastDisposedOn() {
        return lastDisposedOn;
    }

    public void setLastDisposedOn(LocalDateTime lastDisposedOn) {
        this.lastDisposedOn = lastDisposedOn;
    }

    public String getUtmUrl() {
        return utmUrl;
    }

    public void setUtmUrl(String utmUrl) {
        this.utmUrl = utmUrl;
    }

    public String getUnsubscribeUrl() {
        return unsubscribeUrl;
    }

    public void setUnsubscribeUrl(String unsubscribeUrl) {
        this.unsubscribeUrl = unsubscribeUrl;
    }

    public String getServiceRequests() {
        return serviceRequests;
    }

    public void setServiceRequests(String serviceRequests) {
        this.serviceRequests = serviceRequests;
    }

    public String getServicePreference() {
        return servicePreference;
    }

    public void setServicePreference(String servicePreference) {
        this.servicePreference = servicePreference;
    }

    public String getIndicatorCallReferenceId() {
        return indicatorCallReferenceId;
    }

    public void setIndicatorCallReferenceId(String indicatorCallReferenceId) {
        this.indicatorCallReferenceId = indicatorCallReferenceId;
    }

    public String getDealerCampaignOwner() {
        return dealerCampaignOwner;
    }

    public void setDealerCampaignOwner(String dealerCampaignOwner) {
        this.dealerCampaignOwner = dealerCampaignOwner;
    }
}