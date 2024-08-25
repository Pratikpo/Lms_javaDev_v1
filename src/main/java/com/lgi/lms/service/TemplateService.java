package com.lgi.lms.service;

import com.lgi.lms.model.Template;
import com.lgi.lms.model.TemplateType;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface TemplateService {
    Template createTemplate(Template template, MultipartFile file) throws IOException;
    List<Template> getAllActiveTemplates();
    Template updateTemplateStatus(Long id, boolean active);
    Template getTemplateById(Long id);
    Template updateTemplate(Long id, String campaignName, TemplateType type, MultipartFile file, String campaignContent) throws IOException;
    void deleteTemplate(Long id);
    Template updateTemplateWithDynamicData(Long id, Map<String, String> variableValues);
}