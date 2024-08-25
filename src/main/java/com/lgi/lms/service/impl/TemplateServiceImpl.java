package com.lgi.lms.service.impl;

import com.lgi.lms.conf.TemplateUtils;
import com.lgi.lms.model.Template;
import com.lgi.lms.model.TemplateType;
import com.lgi.lms.repository.TemplateRepository;
import com.lgi.lms.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class TemplateServiceImpl implements TemplateService {
    private final TemplateRepository templateRepository;
    private static final long MAX_FILE_SIZE = 2 * 1024 * 1024; // 2 MB
    private static final List<String> ALLOWED_EXTENSIONS = Arrays.asList("pdf", "jpg", "jpeg", "webp", "png", "gif", "mp4");

    @Value("${file.upload-dir}")
    private String uploadDir;

    @Autowired
    public TemplateServiceImpl(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    @Override
    public Template createTemplate(Template template, MultipartFile file) throws IOException {
        validateFile(file);
        String fileName = saveFile(file);
        template.setDocumentPath(fileName);
        template.setActive(true);
        template.setCreatedOn(LocalDateTime.now());
        Set<String> variables = TemplateUtils.extractDynamicVariables(template.getCampaignContent());
        template.setDynamicVariables(variables);
        return templateRepository.save(template);
    }

    @Override
    public List<Template> getAllActiveTemplates() {
        return templateRepository.findByActiveTrue();
    }

    @Override
    public Template updateTemplateStatus(Long id, boolean active) {
        Template template = templateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Template not found"));
        template.setActive(active);
        return templateRepository.save(template);
    }

    @Override
    public Template getTemplateById(Long id) {
        return templateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Template not found"));
    }

    @Override
    public Template updateTemplate(Long id, String campaignName, TemplateType type, MultipartFile file, String campaignContent) throws IOException {
        Template template = getTemplateById(id);
        template.setCampaignName(campaignName);
        template.setType(type);
        if (file != null && !file.isEmpty()) {
            validateFile(file);
            String fileName = saveFile(file);
            template.setDocumentPath(fileName);
        }
        template.setCampaignContent(campaignContent);
        Set<String> variables = TemplateUtils.extractDynamicVariables(campaignContent);
        template.setDynamicVariables(variables);
        return templateRepository.save(template);
    }

    @Override
    public void deleteTemplate(Long id)  {

        Optional<Template> template = templateRepository.findById(id);
        if (template.isPresent()) {
            try {
                templateRepository.deleteById(id);

            } catch (RuntimeException e) {

                throw new RuntimeException("Failed to delete template", e);
            }
        }
    }

    @Override
    public Template updateTemplateWithDynamicData(Long id, Map<String, String> variableValues) {
        Template template = getTemplateById(id);
        String updatedContent = TemplateUtils.replaceDynamicVariables(template.getCampaignContent(), variableValues);
        template.setCampaignContent(updatedContent);
        return templateRepository.save(template);
    }

    private void validateFile(MultipartFile file) {
        if (file.isEmpty()) {
            throw new IllegalArgumentException("File is empty");
        }

        if (file.getSize() > MAX_FILE_SIZE) {
            throw new IllegalArgumentException("File size exceeds the limit of 2 MB");
        }

        String fileExtension = getFileExtension(file.getOriginalFilename());
        if (!ALLOWED_EXTENSIONS.contains(fileExtension.toLowerCase())) {
            throw new IllegalArgumentException("Only PDF, JPG, JPEG, WebP, PNG, GIF, and MP4 files are allowed");
        }
    }

    private String saveFile(MultipartFile file) throws IOException {
        String fileName = generateUniqueFileName(file);
        Path path = Paths.get(uploadDir, fileName);
        Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        return fileName;
    }

    private String generateUniqueFileName(MultipartFile file) {
        String originalFileName = file.getOriginalFilename();
        String fileExtension = getFileExtension(originalFileName);
        return  UUID.randomUUID().toString() + "." + fileExtension;
    }

    private String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}