package com.lgi.lms.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lgi.lms.model.Role;
import com.lgi.lms.model.rowmapper.RoleRowMapper;
import com.lgi.lms.repository.RoleRepository;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Role findById(Long id) {
		try {
			Role role = jdbcTemplate.queryForObject("SELECT id, name FROM roles WHERE id = ?",
					new RoleRowMapper(), id);

			return role;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Role> findAll() {
		return jdbcTemplate.query("SELECT id, name FROM roles", 
				new RoleRowMapper());
	}

}
