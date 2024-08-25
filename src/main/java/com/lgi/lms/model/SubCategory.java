package com.lgi.lms.model;


public class SubCategory {
    private Long id;
    private String name;

    public SubCategory() {}

    public SubCategory(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
