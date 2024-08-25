package com.lgi.lms.repository;




import com.lgi.lms.model.Template;

import java.util.List;
import java.util.Optional;

public interface TemplateRepository {
    Template save(Template template);
    Optional<Template> findById(Long id);
    List<Template> findByActiveTrue();
    void deleteById(Long id);
    List<Template> findAll();
}