package com.lgi.lms.controller;

import com.lgi.lms.model.Template;
import com.lgi.lms.model.TemplateType;
import com.lgi.lms.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api/templates")
public class TemplateController {
    private final TemplateService templateService;


    @Autowired
    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;

    }

    @PostMapping
    public ResponseEntity<Template> createTemplate(@RequestParam String campaignName,
                                                   @RequestParam String typeString,
                                                   @RequestParam MultipartFile document,
                                                   @RequestParam String campaignContent,
                                                   @RequestParam("createdBy") String createdBy) {
        try {
            TemplateType type = TemplateType.valueOf(typeString.toUpperCase());

            Template template = new Template();
            template.setCampaignName(campaignName);
            template.setType(type);
            template.setCampaignContent(campaignContent);
            template.setCreatedBy(createdBy);

            Template savedTemplate = templateService.createTemplate(template, document);
            return ResponseEntity.ok(savedTemplate);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Template>> getAllActiveTemplates() {
        return ResponseEntity.ok(templateService.getAllActiveTemplates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Template> viewTemplate(@PathVariable Long id) {
        try {
            Template template = templateService.getTemplateById(id);
            return ResponseEntity.ok(template);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Template> updateTemplateStatus(@PathVariable Long id, @RequestParam boolean active) {
        try {
            Template updatedTemplate = templateService.updateTemplateStatus(id, active);
            return ResponseEntity.ok(updatedTemplate);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Template> editTemplate(@PathVariable Long id,
                                                 @RequestParam String campaignName,
                                                 @RequestParam String typeString,
                                                 @RequestParam(required = false) MultipartFile document,
                                                 @RequestParam String campaignContent) {
        try {
            TemplateType type = TemplateType.valueOf(typeString.toUpperCase());
            Template updatedTemplate = templateService.updateTemplate(id, campaignName, type, document, campaignContent);
            return ResponseEntity.ok(updatedTemplate);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTemplate(@PathVariable Long id) {
        try {
            templateService.deleteTemplate(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{id}/update-dynamic")
    public ResponseEntity<Template> updateDynamicContent(@PathVariable Long id, @RequestBody Map<String, String> variableValues) {
        try {
            Template updatedTemplate = templateService.updateTemplateWithDynamicData(id, variableValues);
            return ResponseEntity.ok(updatedTemplate);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
