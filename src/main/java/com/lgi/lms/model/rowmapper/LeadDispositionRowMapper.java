package com.lgi.lms.model.rowmapper;

import com.lgi.lms.dto.LeadDispositionDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LeadDispositionRowMapper implements RowMapper<LeadDispositionDTO> {

    @Override
    public LeadDispositionDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        LeadDispositionDTO response = new LeadDispositionDTO();
        response.setDisposition(rs.getString("disposition"));
        response.setTelecaller(rs.getString("telecaller"));
        response.setCallDateTime(rs.getString("callDateTime"));
        response.setSubDisposition(rs.getString("subDisposition"));
        response.setNextFollowUpDateTime(rs.getString("nextFollowUpDateTime"));
        response.setRecordings("N/A");
        return response;
    }
}
