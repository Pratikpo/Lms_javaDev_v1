package com.lgi.lms.service;

import com.lgi.lms.dto.ZoneDetailsDTO;
import com.lgi.lms.model.ZoneMaster;

import java.util.List;

public interface ZoneMasterService {
    void createZone(ZoneMaster zoneMaster);
    List<ZoneDetailsDTO> getAllZoneDetails();
    void deleteZone(Integer id);
    void bulkDeleteZones(List<Integer> ids);
    void updateZone(ZoneMaster zoneMaster);
    List<ZoneDetailsDTO> searchZoneDetails(Integer id, String name, String stateName);
}
