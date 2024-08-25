package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.Team;

public class TeamRowMapper implements RowMapper<Team> {
	
	@Override
    public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
		Team team = new Team();
		team.setId(rs.getLong("id"));
		team.setName(rs.getString("name"));
        return team;
}

}
