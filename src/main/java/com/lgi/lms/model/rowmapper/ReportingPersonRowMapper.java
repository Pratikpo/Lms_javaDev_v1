package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.ReportingPerson;

public class ReportingPersonRowMapper implements RowMapper<ReportingPerson> {
	
	@Override
    public ReportingPerson mapRow(ResultSet rs, int rowNum) throws SQLException {
		ReportingPerson reportingPerson = new ReportingPerson();
		reportingPerson.setId(rs.getLong("id"));
		reportingPerson.setName(rs.getString("fullname"));
        return reportingPerson;
  }

}
