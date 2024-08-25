package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.AssignProduct;

public class AssignProductRowMapper implements RowMapper<AssignProduct> {
	
	 @Override
	    public AssignProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
		 AssignProduct assignProduct = new AssignProduct();
		 assignProduct.setId(rs.getLong("id"));
		 assignProduct.setName(rs.getString("assign_product"));
	        return assignProduct;
	}

}