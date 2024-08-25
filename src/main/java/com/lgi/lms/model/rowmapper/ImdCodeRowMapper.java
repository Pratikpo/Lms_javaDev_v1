package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.ImdCode;

public class ImdCodeRowMapper implements RowMapper<ImdCode> {
	
	 @Override
	    public ImdCode mapRow(ResultSet rs, int rowNum) throws SQLException {
		 ImdCode imdCode = new ImdCode();
		 imdCode.setId(rs.getLong("id"));
		 imdCode.setName(rs.getString("imd_code"));
	        return imdCode;
	}

}

