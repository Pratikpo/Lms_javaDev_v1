package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.SubDesposition;

public class SubDespositionRowMapper implements RowMapper<SubDesposition> {
    @Override
    public SubDesposition mapRow(ResultSet rs, int rowNum) throws SQLException {
        SubDesposition subDesposition = new SubDesposition();
        subDesposition.setId(rs.getLong("id"));
        subDesposition.setDespositionId(rs.getLong("dispositions_id")); 
        subDesposition.setLabel(rs.getString("label"));
        return subDesposition;
    }
}
