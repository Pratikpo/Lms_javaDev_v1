package com.lgi.lms.model;

import java.time.LocalDateTime;
import java.util.Set;

public class Template {
    private Long id;
    private String campaignName;
    private TemplateType type;
    private LocalDateTime createdOn;
    private String createdBy;
    private boolean active;
    private String documentPath;
    private String campaignContent;
    private Set<String> dynamicVariables;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public TemplateType getType() {
        return type;
    }

    public void setType(TemplateType type) {
        this.type = type;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    public String getCampaignContent() {
        return campaignContent;
    }

    public void setCampaignContent(String campaignContent) {
        this.campaignContent = campaignContent;
    }

    public Set<String> getDynamicVariables() {
        return dynamicVariables;
    }

    public void setDynamicVariables(Set<String> dynamicVariables) {
        this.dynamicVariables = dynamicVariables;
    }
}