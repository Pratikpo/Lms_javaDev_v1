package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.lms.model.Lookup;
import com.lgi.lms.model.PublisherMaster;

public class PublisherMasterRowMapper implements RowMapper<PublisherMaster> {

	@Override
	public PublisherMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
		PublisherMaster publisherMaster = new PublisherMaster();
		publisherMaster.setId(rs.getLong("id"));
		publisherMaster.setPublisherName(rs.getString("publisher_name"));
		publisherMaster.setCreatedOn(rs.getTimestamp("created_on").toLocalDateTime());
		Lookup source = new Lookup();
		source.setId(rs.getLong("source_id"));
		source.setLabel(rs.getString("source_name"));
		publisherMaster.setSource(source);
		return publisherMaster;
	}
}
