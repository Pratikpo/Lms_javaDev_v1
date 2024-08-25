package com.lgi.lms.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lgi.lms.dto.Users;
import com.lgi.lms.model.rowmapper.UsersRowMapper;
import com.lgi.lms.repository.UsersRepository;

@Repository
public class UsersRepositoryImpl  implements UsersRepository {
	
	 @Autowired
	  private JdbcTemplate jdbcTemplate;
	 
	 @Override
	  public void addUser(Users user) {
	     String sql = "INSERT INTO users (employee_code, code, fullname, username, password, otp, otp_valid_upto, login_attempts, lock_upto, email, mobile_no, name, role_id, lead_verticle_id, zone_covered, state_covered, district_covered, branch_covered, team_covered, language_known, parent_id, imd_code, assign_product, default_product, created_at, updated_at, is_active, is_deleted, deleted_at) " +
	                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	     jdbcTemplate.update(sql, user.getEmployeeCode(), user.getCode(), user.getFullName(), user.getUsername(), user.getPassword(),
	                            user.getOtp(), user.getOtpValidUpto(), user.getLoginAttempts(), user.getLockUpto(), user.getEmail(), user.getMobileNo(),
	                            user.getName(), user.getRoleId(), user.getLeadVerticalId(), user.getZoneCovered(), user.getStateCovered(), user.getDistrictCovered(),
	                            user.getBranchCovered(), user.getTeamCovered(), user.getLanguageKnown(), user.getParentId(), user.getImdCode(), user.getAssignProduct(),
	                            user.getDefaultProduct(), user.getCreatedAt(), user.getUpdatedAt(), user.getIsActive(), user.getIsDeleted(), user.getDeletedAt());
	    }
	  
	 @Override
	 public List<Users> getAllUsers() {
	     String sql = "SELECT id, employee_code, code, fullname, username, password, email, mobile_no, name, role_id, lead_verticle_id, zone_covered, state_covered, district_covered, branch_covered, team_covered, language_known, parent_id, imd_code, assign_product, default_product, is_active FROM users";
	     return jdbcTemplate.query(sql, new UsersRowMapper());
	 }

	  
	 @Override
	 public Users getUserById(Long id) {
	     String sql = "SELECT id, employee_code, code, fullname, username, password, email, mobile_no, name, role_id, lead_verticle_id, zone_covered, state_covered, district_covered, branch_covered, team_covered, language_known, parent_id, imd_code, assign_product, default_product, is_active FROM users WHERE id = ?";
	     return jdbcTemplate.queryForObject(sql, new UsersRowMapper(), id);
   }

	@Override
	public List<Users> telecallerByParentId(int parentId) {
		String sql = "SELECT id, employee_code, code, fullname, username, password, email, mobile_no, name, role_id, lead_verticle_id, zone_covered, state_covered, district_covered, branch_covered, team_covered, language_known, parent_id, imd_code, assign_product, default_product, is_active FROM users WHERE role_id = 4 AND parent_id = ?";
		return jdbcTemplate.query(sql, new UsersRowMapper(), parentId);
	}

}
	  
