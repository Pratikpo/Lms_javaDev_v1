package com.lgi.lms.repository;

import com.lgi.lms.dto.ZoneDetailsDTO;
import com.lgi.lms.model.ZoneMaster;

import java.util.List;

public interface ZoneMasterRepository {
    int save(ZoneMaster zoneMaster);
    void updateStateZoneId(Integer zoneId, List<Integer> stateIds);
    List<ZoneDetailsDTO> getAllZoneDetails();
    void deleteZone(Integer id);
    void bulkDeleteZones(List<Integer> ids);
    void updateZone(ZoneMaster zoneMaster);
    List<ZoneDetailsDTO> searchZoneDetails(Integer id, String name, String stateName);

}