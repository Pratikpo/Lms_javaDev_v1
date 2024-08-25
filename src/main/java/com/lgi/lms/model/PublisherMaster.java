
package com.lgi.lms.model;

import java.time.LocalDateTime;

public class PublisherMaster {

    private Long id;
    private String publisherName;
    private LocalDateTime createdOn;
    private Lookup source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public Lookup getSource() {
		return source;
	}

	public void setSource(Lookup source) {
		this.source = source;
	}
    
}
