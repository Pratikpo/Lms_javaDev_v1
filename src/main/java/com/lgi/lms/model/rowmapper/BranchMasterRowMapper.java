package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.Branch_Master;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BranchMasterRowMapper implements RowMapper<Branch_Master> {
    @Override
    public Branch_Master mapRow(ResultSet rs, int rowNum) throws SQLException {
        Branch_Master branch = new Branch_Master();
        branch.setId(rs.getInt("id"));
        branch.setBranchId(rs.getInt("BranchID"));
        branch.setName(rs.getString("Name"));
        branch.setRegionId(rs.getInt("RegionID"));
        branch.setZoneId(rs.getInt("ZoneID"));
        branch.setStateId(rs.getInt("state_id"));
        branch.setDistrictId(rs.getInt("district_id"));
        branch.setBranchType(rs.getString("BranchType"));
        branch.setAddress(rs.getString("Address"));
        branch.setReportingBranchId(rs.getInt("ReportingBranchID"));
        branch.setContactNo(rs.getString("ContactNo"));
        branch.setMomId(rs.getInt("MOM_ID"));
        branch.setContactPerson(rs.getString("ContactPerson"));
        branch.setStatus(rs.getInt("status"));
        branch.setBsOffice(rs.getString("B_S_Office"));
        branch.setCompAgencyId(rs.getString("CompAgencyID"));
        branch.setLocationLevel(rs.getString("LocationLevel"));
        branch.setZonalClass(rs.getString("ZonalClass"));
        branch.setGcBranchId(rs.getInt("GCBranchId"));
        return branch;
    }
}
