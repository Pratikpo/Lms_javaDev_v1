package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.model.LeadVertical;

public class LeadVerticalRowMapper implements RowMapper<LeadVertical> {

	@Override
	/*public LeadVertical mapRow(ResultSet rs, int rowNum) throws SQLException {
		LeadVertical leadVertical = new LeadVertical();
		leadVertical.setId(rs.getLong("id"));
		leadVertical.setCode(rs.getString("code"));
		leadVertical.setLabel(rs.getString("name"));
		return leadVertical;
	}
*/
	
	public LeadVertical mapRow(ResultSet rs, int rowNum) throws SQLException {
        LeadVertical leadVertical = new LeadVertical();
        leadVertical.setId(rs.getLong("id"));
        leadVertical.setLabel(rs.getString("name"));
        return leadVertical;
    }
}
