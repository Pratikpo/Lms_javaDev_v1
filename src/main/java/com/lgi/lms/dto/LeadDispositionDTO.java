package com.lgi.lms.dto;

public class LeadDispositionDTO {
    private String disposition;
    private String telecaller;
    private String callDateTime;
    private String subDisposition;
    private String nextFollowUpDateTime;
    private String recordings;

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getTelecaller() {
        return telecaller;
    }

    public void setTelecaller(String telecaller) {
        this.telecaller = telecaller;
    }

    public String getCallDateTime() {
        return callDateTime;
    }

    public void setCallDateTime(String callDateTime) {
        this.callDateTime = callDateTime;
    }

    public String getSubDisposition() {
        return subDisposition;
    }

    public void setSubDisposition(String subDisposition) {
        this.subDisposition = subDisposition;
    }

    public String getNextFollowUpDateTime() {
        return nextFollowUpDateTime;
    }

    public void setNextFollowUpDateTime(String nextFollowUpDateTime) {
        this.nextFollowUpDateTime = nextFollowUpDateTime;
    }

    public String getRecordings() {
        return recordings;
    }

    public void setRecordings(String recordings) {
        this.recordings = recordings;
    }
}
