package com.lgi.lms.model;

import java.util.Date;

public class DmsMaster {
    private int id;
    private String productType; // This will be set from biztype in policy_master
    private int policyMasterId;
    private String leadId;
    private String policyNumber;
    private String documentGroup;
    private String documentType;
    private String dmsComment;

    private String documentFile;
    private String document;
    private String documentEncode;
    private String request;
    private String status;
    private String response;
    private int uploadBy;
    private Date uploadOn;
    private String NM_Discounts;
    private String NM_Discount;
    private String NM_Loadings;
    private String NM_Loading;

    public String getNM_Discounts() {
        return NM_Discounts;
    }

    public void setNM_Discounts(String NM_Discounts) {
        this.NM_Discounts = NM_Discounts;
    }

    public String getNM_Discount() {
        return NM_Discount;
    }

    public void setNM_Discount(String NM_Discount) {
        this.NM_Discount = NM_Discount;
    }

    public String getNM_Loadings() {
        return NM_Loadings;
    }

    public void setNM_Loadings(String NM_Loadings) {
        this.NM_Loadings = NM_Loadings;
    }

    public String getNM_Loading() {
        return NM_Loading;
    }

    public void setNM_Loading(String NM_Loading) {
        this.NM_Loading = NM_Loading;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getPolicyMasterId() {
        return policyMasterId;
    }

    public void setPolicyMasterId(int policyMasterId) {
        this.policyMasterId = policyMasterId;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getDocumentGroup() {
        return documentGroup;
    }

    public void setDocumentGroup(String documentGroup) {
        this.documentGroup = documentGroup;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDmsComment() {
        return dmsComment;
    }

    public void setDmsComment(String dmsComment) {
        this.dmsComment = dmsComment;
    }

    public String getDocumentFile() {
        return documentFile;
    }

    public void setDocumentFile(String documentFile) {
        this.documentFile = documentFile;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocumentEncode() {
        return documentEncode;
    }

    public void setDocumentEncode(String documentEncode) {
        this.documentEncode = documentEncode;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getUploadBy() {
        return uploadBy;
    }

    public void setUploadBy(int uploadBy) {
        this.uploadBy = uploadBy;
    }

    public Date getUploadOn() {
        return uploadOn;
    }

    public void setUploadOn(Date uploadOn) {
        this.uploadOn = uploadOn;
    }
}
