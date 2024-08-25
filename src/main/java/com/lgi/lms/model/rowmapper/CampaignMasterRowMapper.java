package com.lgi.lms.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.lgi.lms.model.CampaignMaster;
import com.lgi.lms.model.Lookup;

public class CampaignMasterRowMapper implements RowMapper<CampaignMaster> {

    @Override
    public CampaignMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        CampaignMaster campaignMaster = new CampaignMaster();
        campaignMaster.setId(rs.getLong("id"));
        campaignMaster.setCampaignName(rs.getString("campaign_name"));
        campaignMaster.setCreatedOn(rs.getTimestamp("created_on").toLocalDateTime());
        
        Lookup source = new Lookup();
        source.setId(rs.getLong("source_id"));
		source.setLabel(rs.getString("source_name"));
		source.setId(rs.getLong("publisher_id"));
		source.setLabel(rs.getString("publisher_name"));
        campaignMaster.setSource(source);
        
        return campaignMaster; 
    }
}
