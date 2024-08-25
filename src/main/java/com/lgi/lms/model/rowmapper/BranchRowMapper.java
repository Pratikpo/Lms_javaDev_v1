package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.Branch;

public class BranchRowMapper implements RowMapper<Branch> {

    @Override
    public Branch mapRow(ResultSet rs, int rowNum) throws SQLException {
        Branch branch = new Branch();
        branch.setId(rs.getLong("id"));
        branch.setBranchId(rs.getString("branch_id"));
        branch.setName(rs.getString("name"));
        return branch;
    }
}
