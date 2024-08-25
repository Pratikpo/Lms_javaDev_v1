package com.lgi.lms.service.impl;

import com.lgi.lms.dto.ZoneDetailsDTO;
import com.lgi.lms.model.ZoneMaster;
import com.lgi.lms.repository.ZoneMasterRepository;
import com.lgi.lms.service.ZoneMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ZoneMasterServiceImpl implements ZoneMasterService {


    private final ZoneMasterRepository zoneMasterRepository;

    @Autowired
    public ZoneMasterServiceImpl(ZoneMasterRepository zoneMasterRepository) {
        this.zoneMasterRepository = zoneMasterRepository;
    }

    @Override
    @Transactional
    public void createZone(ZoneMaster zoneMaster) {
        int zoneId = zoneMasterRepository.save(zoneMaster);
        zoneMasterRepository.updateStateZoneId(zoneId, zoneMaster.getStateIds());
    }

    @Override
    public List<ZoneDetailsDTO> getAllZoneDetails() {
        return zoneMasterRepository.getAllZoneDetails();
    }

    @Override
    public void deleteZone(Integer id) {
        zoneMasterRepository.deleteZone(id);
    }

    @Override
    public void bulkDeleteZones(List<Integer> ids) {
        zoneMasterRepository.bulkDeleteZones(ids);
    }

    @Override
    public void updateZone(ZoneMaster zoneMaster) {
        zoneMasterRepository.updateZone(zoneMaster);
    }

    @Override
    public List<ZoneDetailsDTO> searchZoneDetails(Integer id, String name, String stateName) {
        return zoneMasterRepository.searchZoneDetails(id, name, stateName);
    }


}
