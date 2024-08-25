package com.lgi.lms.repository.impl;


import com.lgi.lms.dto.BranchInfoDTO;

import com.lgi.lms.model.Branch_Master;
import com.lgi.lms.repository.BranchMasterRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
    public class BranchMasterRepositoryImpl implements BranchMasterRepository {
    private final JdbcTemplate jdbcTemplate;

    public BranchMasterRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Branch_Master branch) {
        String sql = "INSERT INTO branch_master (BranchID, Name, state_id, district_id, Address, status) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                branch.getBranchId(),
                branch.getName(),
                branch.getStateId(),
                branch.getDistrictId(),
                branch.getAddress(),
                branch.getStatus()
        );
    }
    @Override
    public List<BranchInfoDTO> getAllBranchesInfo() {
        String sql = "SELECT bm.BranchID, bm.Name as branch_name, bm.Address, bm.status, " +
                "sm.id as state_id, sm.state_cleaned as state_name, " +
                "cm.id as district_id, cm.name as district_name " +
                "FROM branch_master bm " +
                "LEFT JOIN state_master sm ON bm.state_id = sm.id " +
                "LEFT JOIN city_master cm ON bm.district_id = cm.id";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            BranchInfoDTO dto = new BranchInfoDTO();
            dto.setBranchId(rs.getInt("BranchID"));
            dto.setBranchName(rs.getString("branch_name"));
            dto.setBranchAddress(rs.getString("Address"));

            BranchInfoDTO.StateInfo stateInfo = new BranchInfoDTO.StateInfo();
            stateInfo.setId(rs.getInt("state_id"));
            stateInfo.setName(rs.getString("state_name"));
            dto.setState(stateInfo);

            BranchInfoDTO.DistrictInfo districtInfo = new BranchInfoDTO.DistrictInfo();
            districtInfo.setId(rs.getInt("district_id"));
            districtInfo.setName(rs.getString("district_name"));
            dto.setDistrict(districtInfo);

            dto.setStatus(rs.getInt("status") == 1 ? "Active" : "Inactive");

            return dto;
        });
    }

    @Override
    public Optional<BranchInfoDTO> getBranchInfoById(Integer id) {
        String sql = "SELECT bm.id, bm.BranchID, bm.Name as branch_name, bm.Address, bm.status, " +
                "sm.id as state_id, sm.state_cleaned as state_name, " +
                "cm.id as district_id, cm.name as district_name " +
                "FROM branch_master bm " +
                "LEFT JOIN state_master sm ON bm.state_id = sm.id " +
                "LEFT JOIN city_master cm ON bm.district_id = cm.id " +
                "WHERE bm.id = ?";

        try {
            return Optional.ofNullable(jdbcTemplate.queryForObject(sql, new BranchInfoRowMapper(), id));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    private static class BranchInfoRowMapper implements RowMapper<BranchInfoDTO> {
        @Override
        public BranchInfoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
            BranchInfoDTO dto = new BranchInfoDTO();
            dto.setId(rs.getInt("id"));
            dto.setBranchId(rs.getInt("BranchID"));
            dto.setBranchName(rs.getString("branch_name"));
            dto.setBranchAddress(rs.getString("Address"));

            BranchInfoDTO.StateInfo stateInfo = new BranchInfoDTO.StateInfo();
            stateInfo.setId(rs.getInt("state_id"));
            stateInfo.setName(rs.getString("state_name"));
            dto.setState(stateInfo);

            BranchInfoDTO.DistrictInfo districtInfo = new BranchInfoDTO.DistrictInfo();
            districtInfo.setId(rs.getInt("district_id"));
            districtInfo.setName(rs.getString("district_name"));
            dto.setDistrict(districtInfo);

            dto.setStatus(rs.getInt("status") == 1 ? "Active" : "Inactive");

            return dto;
        }
    }
    @Override
    public void updateBranch(BranchInfoDTO branchInfo) {
        String sql = "UPDATE branch_master SET BranchID = ?, Name = ?, state_id = ?, district_id = ?, Address = ?, status = ? WHERE id = ?";

        jdbcTemplate.update(sql,
                branchInfo.getBranchId(),
                branchInfo.getBranchName(),
                branchInfo.getState().getId(),
                branchInfo.getDistrict().getId(),
                branchInfo.getBranchAddress(),
                "Active".equalsIgnoreCase(branchInfo.getStatus()) ? 1 : 0,
                branchInfo.getId()
        );
    }

    @Override
    public void deleteBranch(Integer id) {
        String sql = "DELETE FROM branch_master WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }



}

