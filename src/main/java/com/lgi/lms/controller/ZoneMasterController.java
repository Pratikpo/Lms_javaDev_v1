package com.lgi.lms.controller;


import com.lgi.lms.dto.ZoneDetailsDTO;
import com.lgi.lms.model.ZoneMaster;
import com.lgi.lms.service.ZoneMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zones")
public class ZoneMasterController {
    private final ZoneMasterService zoneMasterService;

    @Autowired
    public ZoneMasterController(ZoneMasterService zoneMasterService) {
        this.zoneMasterService = zoneMasterService;
    }

    @PostMapping("/addZone")
    public ResponseEntity<String> addZone(@RequestBody ZoneMaster zoneMaster) {
        try {
            zoneMasterService.createZone(zoneMaster);
            return ResponseEntity.ok("Zone created successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error creating zone: " + e.getMessage());
        }
    }
    @GetMapping("/zoneList")
    public ResponseEntity<List<ZoneDetailsDTO>> getAllZones() {
        try {
            List<ZoneDetailsDTO> zones = zoneMasterService.getAllZoneDetails();
            return ResponseEntity.ok(zones);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteZone(@PathVariable Integer id) {
        try {
            zoneMasterService.deleteZone(id);
            return ResponseEntity.ok("Zone with ID " + id + " has been successfully deleted");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while deleting the zone: " + e.getMessage());
        }
    }

    @DeleteMapping("/delete/bulk")
    public ResponseEntity<String> bulkDeleteZones(@RequestBody List<Integer> ids) {
        try {
            zoneMasterService.bulkDeleteZones(ids);
            return ResponseEntity.ok("Zones with IDs " + ids + " have been successfully deleted");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while deleting the zones: " + e.getMessage());
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateZone(@PathVariable Integer id, @RequestBody ZoneMaster zoneMaster) {
        try {
            zoneMaster.setId(id);
            zoneMasterService.updateZone(zoneMaster);
            return ResponseEntity.ok("Zone with ID " + id + " has been successfully updated");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while updating the zone: " + e.getMessage());
        }
    }



    @GetMapping("/search")
    public List<ZoneDetailsDTO> searchZoneDetails(
            @RequestParam(required = false) Integer id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String stateName) {
        return zoneMasterService.searchZoneDetails(id, name, stateName);
    }

}