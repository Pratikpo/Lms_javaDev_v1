package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.DmsMaster;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DmsMasterRowMapper implements RowMapper<DmsMaster> {
    public DmsMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        DmsMaster dmsMaster = new DmsMaster();
        dmsMaster.setId(rs.getInt("id"));
        dmsMaster.setProductType(rs.getString("product_type"));
        dmsMaster.setPolicyMasterId(rs.getInt("policy_master_id"));
        dmsMaster.setLeadId(rs.getString("lead_id"));
        dmsMaster.setPolicyNumber(rs.getString("policy_number"));
        dmsMaster.setDocumentGroup(rs.getString("document_group"));
        dmsMaster.setDocumentType(rs.getString("document_type"));
        dmsMaster.setDmsComment(rs.getString("dms_comment"));
        dmsMaster.setDocumentFile(null);
        dmsMaster.setDocument(rs.getString("document"));
        dmsMaster.setDocumentEncode(null);
        dmsMaster.setRequest(null);
        dmsMaster.setStatus(null);
        dmsMaster.setResponse(null);
        dmsMaster.setUploadBy(rs.getInt("upload_by"));
        dmsMaster.setUploadOn(rs.getTimestamp("upload_on"));
        dmsMaster.setNM_Discounts(null);
        dmsMaster.setNM_Discount(null);
        dmsMaster.setNM_Loadings(null);
        dmsMaster.setNM_Loading(null);

        return dmsMaster;
    }
}