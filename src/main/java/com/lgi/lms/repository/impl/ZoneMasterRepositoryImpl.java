package com.lgi.lms.repository.impl;
import com.lgi.lms.dto.ZoneDetailsDTO;
import com.lgi.lms.model.ZoneMaster;
import com.lgi.lms.repository.ZoneMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

@Repository
public class ZoneMasterRepositoryImpl implements ZoneMasterRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ZoneMasterRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(ZoneMaster zoneMaster) {
        String sql = "INSERT INTO zone_master (zone_name, state_id, district_id, branch_id, status) " +
                "VALUES (?, ?, ?, ?, ?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, zoneMaster.getZoneName());
            ps.setString(2, String.join(",", zoneMaster.getStateIds().stream().map(Object::toString).collect(Collectors.toList())));
            ps.setString(3, String.join(",", zoneMaster.getDistrictIds().stream().map(Object::toString).collect(Collectors.toList())));
            ps.setString(4, String.join(",", zoneMaster.getBranchIds().stream().map(Object::toString).collect(Collectors.toList())));
            ps.setBoolean(5, zoneMaster.getStatus());
            return ps;
        }, keyHolder);

        return keyHolder.getKey().intValue();
    }

    @Override
    public void updateStateZoneId(Integer zoneId, List<Integer> stateIds) {
        String sql = "UPDATE state_master SET zone_id = ? WHERE id IN (" +
                String.join(",", Collections.nCopies(stateIds.size(), "?")) + ")";

        Object[] params = new Object[stateIds.size() + 1];
        params[0] = zoneId;
        System.arraycopy(stateIds.toArray(), 0, params, 1, stateIds.size());

        jdbcTemplate.update(sql, params);
    }
    @Override
    public List<ZoneDetailsDTO> getAllZoneDetails() {
        String sql = "SELECT zm.id, zm.zone_name, zm.state_id, zm.district_id, zm.branch_id, zm.status, " +
                "GROUP_CONCAT(DISTINCT CONCAT(sm.id, ':', sm.state_cleaned) SEPARATOR '|') as state_info, " +
                "GROUP_CONCAT(DISTINCT CONCAT(cm.id, ':', cm.city_cleaned) SEPARATOR '|') as district_info, " +
                "GROUP_CONCAT(DISTINCT CONCAT(bm.id, ':', bm.Name) SEPARATOR '|') as branch_info " +
                "FROM zone_master zm " +
                "LEFT JOIN state_master sm ON FIND_IN_SET(sm.id, zm.state_id) " +
                "LEFT JOIN city_master cm ON FIND_IN_SET(cm.id, zm.district_id) " +
                "LEFT JOIN branch_master bm ON FIND_IN_SET(bm.id, zm.branch_id) " +
                "GROUP BY zm.id, zm.zone_name, zm.state_id, zm.district_id, zm.branch_id, zm.status";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            ZoneDetailsDTO dto = new ZoneDetailsDTO();
            dto.setId(rs.getInt("id"));
            dto.setZoneName(rs.getString("zone_name"));
            dto.setStatus(rs.getBoolean("status") ? "Active" : "Inactive");
            dto.setStates(parseInfoWithId(rs.getString("state_info"), ZoneDetailsDTO.StateInfo::new));
            dto.setDistricts(parseInfoWithId(rs.getString("district_info"), ZoneDetailsDTO.DistrictInfo::new));
            dto.setBranches(parseInfoWithId(rs.getString("branch_info"), ZoneDetailsDTO.BranchInfo::new));
            return dto;
        });
    }


    @Override
    public void deleteZone(Integer id) {
        String sql = "DELETE FROM zone_master WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
    @Override
    public void bulkDeleteZones(List<Integer> ids) {
        String sql = "DELETE FROM zone_master WHERE id IN (" +
                String.join(",", Collections.nCopies(ids.size(), "?")) + ")";
        jdbcTemplate.update(sql, ids.toArray());
    }
    @Override
    public void updateZone(ZoneMaster zoneMaster) {
        String sql = "UPDATE zone_master SET zone_name = ?, state_id = ?, district_id = ?, branch_id = ?, status = ? WHERE id = ?";
        jdbcTemplate.update(sql,
                zoneMaster.getZoneName(),
                String.join(",", zoneMaster.getStateIds().stream().map(Object::toString).collect(Collectors.toList())),
                String.join(",", zoneMaster.getDistrictIds().stream().map(Object::toString).collect(Collectors.toList())),
                String.join(",", zoneMaster.getBranchIds().stream().map(Object::toString).collect(Collectors.toList())),
                zoneMaster.getStatus(),
                zoneMaster.getId()
        );
    }

    @Override
    public List<ZoneDetailsDTO> searchZoneDetails(Integer id, String name, String stateName) {
        StringBuilder sql = new StringBuilder(
                "SELECT zm.id, zm.zone_name, zm.state_id, zm.district_id, zm.branch_id, zm.status, " +
                        "GROUP_CONCAT(DISTINCT CONCAT(sm.id, ':', sm.state_cleaned) SEPARATOR '|') as state_info, " +
                        "GROUP_CONCAT(DISTINCT CONCAT(cm.id, ':', cm.city_cleaned) SEPARATOR '|') as district_info, " +
                        "GROUP_CONCAT(DISTINCT CONCAT(bm.id, ':', bm.Name) SEPARATOR '|') as branch_info " +
                        "FROM zone_master zm " +
                        "LEFT JOIN state_master sm ON FIND_IN_SET(sm.id, zm.state_id) " +
                        "LEFT JOIN city_master cm ON FIND_IN_SET(cm.id, zm.district_id) " +
                        "LEFT JOIN branch_master bm ON FIND_IN_SET(bm.id, zm.branch_id) " +
                        "WHERE 1=1 ");

        List<Object> params = new ArrayList<>();

        if (id != null) {
            sql.append("AND zm.id = ? ");
            params.add(id);
        }

        if (name != null && !name.trim().isEmpty()) {
            sql.append("AND zm.zone_name LIKE ? ");
            params.add("%" + name + "%");
        }

        if (stateName != null && !stateName.trim().isEmpty()) {
            sql.append("AND sm.state_cleaned LIKE ? ");
            params.add("%" + stateName + "%");
        }

        sql.append("GROUP BY zm.id, zm.zone_name, zm.state_id, zm.district_id, zm.branch_id, zm.status ");

        if (id != null) {

            sql.append("ORDER BY (zm.id = ?) DESC, zm.id ASC");
            params.add(id);
        } else {
            sql.append("ORDER BY zm.id ASC");
        }

        return jdbcTemplate.query(sql.toString(), params.toArray(), (rs, rowNum) -> {
            ZoneDetailsDTO dto = new ZoneDetailsDTO();
            dto.setId(rs.getInt("id"));
            dto.setZoneName(rs.getString("zone_name"));
            dto.setStatus(rs.getBoolean("status") ? "Active" : "Inactive");
            dto.setStates(parseInfoWithId(rs.getString("state_info"), ZoneDetailsDTO.StateInfo::new));
            dto.setDistricts(parseInfoWithId(rs.getString("district_info"), ZoneDetailsDTO.DistrictInfo::new));
            dto.setBranches(parseInfoWithId(rs.getString("branch_info"), ZoneDetailsDTO.BranchInfo::new));
            return dto;
        });
    }


    private <T> List<T> parseInfoWithId(String info, BiFunction<Integer, String, T> constructor) {
        if (info == null || info.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(info.split("\\|"))
                .map(s -> s.split(":", 2))
                .filter(arr -> arr.length == 2)
                .map(arr -> constructor.apply(Integer.parseInt(arr[0].trim()), arr[1].trim()))
                .collect(Collectors.toList());
    }

}