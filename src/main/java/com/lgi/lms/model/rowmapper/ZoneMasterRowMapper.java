package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.ZoneMaster;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZoneMasterRowMapper implements RowMapper<ZoneMaster> {
    @Override
    public ZoneMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        ZoneMaster zoneMaster = new ZoneMaster();
        zoneMaster.setId(rs.getInt("id"));
        zoneMaster.setZoneName(rs.getString("zone_name"));
        zoneMaster.setStateIds(parseIds(rs.getString("state_id")));
        zoneMaster.setDistrictIds(parseIds(rs.getString("district_id")));
        zoneMaster.setBranchIds(parseIds(rs.getString("branch_id")));
        zoneMaster.setStatus(rs.getBoolean("status"));
        return zoneMaster;
    }

    private List<Integer> parseIds(String ids) {
        if (ids == null || ids.isEmpty()) {
            return List.of();
        }
        return Arrays.stream(ids.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}