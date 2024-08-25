package com.lgi.lms.model.rowmapper;


import com.lgi.lms.model.City_Master;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityMasterRowMapper implements RowMapper<City_Master> {
    @Override
    public City_Master mapRow(ResultSet rs, int rowNum) throws SQLException {
        City_Master city = new City_Master();
        city.setId(rs.getInt("id"));
        city.setCityCleaned(rs.getString("city_cleaned"));
        city.setName(rs.getString("name"));
        city.setGroupCode(rs.getString("group_code"));
        city.setStateId(rs.getInt("state_id"));
        city.setStatusId(rs.getString("status_id"));
        city.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        city.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        return city;
    }
}