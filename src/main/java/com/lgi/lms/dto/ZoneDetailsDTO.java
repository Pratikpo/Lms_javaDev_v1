package com.lgi.lms.dto;

import java.util.List;

public class ZoneDetailsDTO {
    private Integer id;
    private String zoneName;
    private List<StateInfo> states;
    private List<DistrictInfo> districts;
    private List<BranchInfo> branches;
    private String status;

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

    public List<StateInfo> getStates() {
        return states;
    }

    public void setStates(List<StateInfo> states) {
        this.states = states;
    }

    public List<DistrictInfo> getDistricts() {
        return districts;
    }

    public void setDistricts(List<DistrictInfo> districts) {
        this.districts = districts;
    }

    public List<BranchInfo> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchInfo> branches) {
        this.branches = branches;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class StateInfo {
        private Integer id;
        private String name;

        public StateInfo(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class DistrictInfo {
        private Integer id;
        private String name;

        public DistrictInfo(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class BranchInfo {
        private Integer id;
        private String name;

        public BranchInfo(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}