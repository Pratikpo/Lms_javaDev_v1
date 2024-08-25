package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.dto.Users;

public class UsersRowMapper implements RowMapper<Users> {

    @Override
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        Users user = new Users();
        
        user.setId(rs.getLong("id"));
        user.setEmployeeCode(rs.getString("employee_code"));
        user.setCode(rs.getString("code"));
        user.setFullName(rs.getString("fullname"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setEmail(rs.getString("email"));
        user.setMobileNo(rs.getString("mobile_no"));
        user.setName(rs.getString("name"));
        user.setRoleId(rs.getInt("role_id"));
        user.setLeadVerticalId(rs.getInt("lead_verticle_id"));
        user.setZoneCovered(rs.getInt("zone_covered"));
        user.setStateCovered(rs.getInt("state_covered"));
        user.setDistrictCovered(rs.getInt("district_covered"));
        user.setBranchCovered(rs.getInt("branch_covered"));
        user.setTeamCovered(rs.getInt("team_covered"));
        user.setLanguageKnown(rs.getString("language_known"));
        user.setParentId(rs.getInt("parent_id"));
        user.setImdCode(rs.getString("imd_code"));
        user.setAssignProduct(rs.getString("assign_product"));
        user.setDefaultProduct(rs.getInt("default_product"));
        user.setIsActive(rs.getString("is_active"));
        return user;
    }

    private LocalDateTime getLocalDateTime(ResultSet rs, String columnName) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnName);
        return (timestamp != null) ? timestamp.toLocalDateTime() : null;
    }
}
