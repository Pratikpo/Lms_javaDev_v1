package com.lgi.lms.model;

import java.time.LocalDateTime;
import java.util.List;

public class ZoneMaster {
    private Integer id;
    private String zoneName;
    private List<Integer> stateIds;
    private List<Integer> districtIds;
    private List<Integer> branchIds;
    private Boolean status;

    // Constructor
    public ZoneMaster() {
        this.status = true;  // Set default status to true (1)
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public List<Integer> getStateIds() {
        return stateIds;
    }

    public void setStateIds(List<Integer> stateIds) {
        this.stateIds = stateIds;
    }

    public List<Integer> getDistrictIds() {
        return districtIds;
    }

    public void setDistrictIds(List<Integer> districtIds) {
        this.districtIds = districtIds;
    }

    public List<Integer> getBranchIds() {
        return branchIds;
    }

    public void setBranchIds(List<Integer> branchIds) {
        this.branchIds = branchIds;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
