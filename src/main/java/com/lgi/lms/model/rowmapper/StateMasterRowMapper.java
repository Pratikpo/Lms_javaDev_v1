package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.State_Master;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StateMasterRowMapper implements RowMapper<State_Master> {
    @Override
    public State_Master mapRow(ResultSet rs, int rowNum) throws SQLException {
        State_Master state = new State_Master();
        state.setId(rs.getInt("id"));
        state.setCode(rs.getString("code"));
        state.setName(rs.getString("name"));
        state.setStateCleaned(rs.getString("state_cleaned"));
        state.setRegion(rs.getString("region"));
        state.setStatusId(rs.getString("status_id"));
        state.setZoneId(rs.getInt("zone_id"));
        state.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        state.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        return state;
    }
}