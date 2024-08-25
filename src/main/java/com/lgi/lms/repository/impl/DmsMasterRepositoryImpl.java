package com.lgi.lms.repository.impl;

import com.lgi.lms.model.DmsMaster;
import com.lgi.lms.model.DmsPolicy;
import com.lgi.lms.model.rowmapper.DmsPolicyRowMapper;
import com.lgi.lms.repository.DmsMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DmsMasterRepositoryImpl implements DmsMasterRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveDmsMaster(DmsMaster dmsMaster) {
        String sql = "INSERT INTO dms_master (product_type, policy_master_id, lead_id, " +
                "policy_number, document_group, document_type, dms_comment, document_file, " +
                "document, document_encode, request, status, response, upload_by, upload_on) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, NULL, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                dmsMaster.getProductType(),
                dmsMaster.getPolicyMasterId(),
                dmsMaster.getLeadId(),
                dmsMaster.getPolicyNumber(),
                dmsMaster.getDocumentGroup(),
                dmsMaster.getDocumentType(),
                dmsMaster.getDmsComment(),
                dmsMaster.getDocument(), // This is where the file path or name will be saved
                dmsMaster.getDocumentEncode(), // Can be null
                dmsMaster.getRequest(), // Can be null
                dmsMaster.getStatus(), // Can be null
                dmsMaster.getResponse(), // Can be null
                dmsMaster.getUploadBy(),
                dmsMaster.getUploadOn()
        );
    }

    @Override
    public DmsPolicy findPolicyMasterById(int id) {
        String sql = "SELECT * FROM policy_master WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new DmsPolicyRowMapper());
    }
}
