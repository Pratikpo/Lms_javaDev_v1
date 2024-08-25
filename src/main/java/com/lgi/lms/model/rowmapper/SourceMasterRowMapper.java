package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.SourceMaster;

public class SourceMasterRowMapper implements RowMapper<SourceMaster> {

    @Override
    public SourceMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        SourceMaster sourceMaster = new SourceMaster();
        sourceMaster.setId(rs.getLong("id"));
        sourceMaster.setSourceName(rs.getString("source_name"));
        sourceMaster.setStatus(rs.getString("status"));
        sourceMaster.setCreatedOn(rs.getTimestamp("created_on").toLocalDateTime());
        return sourceMaster;
    }
}
