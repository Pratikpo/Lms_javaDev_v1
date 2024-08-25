package com.lgi.lms.dto;

public class PushLeadExternalRequest {
    private String CallId;
    private String Customer_Name;
    private String Customer_Mobile_No;
    private String Telecaller_User_Id;
    private String Lead_Id;
    private String Camaign_Id;
    private String Campaign_Name;
    private String Lead_Type;

    public String getCallId() {
        return CallId;
    }

    public void setCallId(String callId) {
        CallId = callId;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getCustomer_Mobile_No() {
        return Customer_Mobile_No;
    }

    public void setCustomer_Mobile_No(String customer_Mobile_No) {
        Customer_Mobile_No = customer_Mobile_No;
    }

    public String getTelecaller_User_Id() {
        return Telecaller_User_Id;
    }

    public void setTelecaller_User_Id(String telecaller_User_Id) {
        Telecaller_User_Id = telecaller_User_Id;
    }

    public String getLead_Id() {
        return Lead_Id;
    }

    public void setLead_Id(String lead_Id) {
        Lead_Id = lead_Id;
    }

    public String getCamaign_Id() {
        return Camaign_Id;
    }

    public void setCamaign_Id(String camaign_Id) {
        Camaign_Id = camaign_Id;
    }

    public String getCampaign_Name() {
        return Campaign_Name;
    }

    public void setCampaign_Name(String campaign_Name) {
        Campaign_Name = campaign_Name;
    }

    public String getLead_Type() {
        return Lead_Type;
    }

    public void setLead_Type(String lead_Type) {
        Lead_Type = lead_Type;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getLead_Created_Date() {
        return Lead_Created_Date;
    }

    public void setLead_Created_Date(String lead_Created_Date) {
        Lead_Created_Date = lead_Created_Date;
    }

    private String Priority;
    private String Lead_Created_Date;

}
