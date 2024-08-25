package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.Desposition;

public class DespositionRowMapper implements RowMapper<Desposition> {

	@Override
	public Desposition mapRow(ResultSet rs, int rowNum) throws SQLException {
		Desposition desposition = new Desposition();
		desposition.setId(rs.getLong("id"));
		desposition.setDispositionName(rs.getString("name"));
		return desposition;	
	}
	

}
