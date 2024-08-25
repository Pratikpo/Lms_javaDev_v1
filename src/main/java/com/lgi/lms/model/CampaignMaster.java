package com.lgi.lms.model;

import java.time.LocalDateTime;

public class CampaignMaster {

    private Long id;
    private String campaignName;
    private LocalDateTime createdOn;
    private Lookup source;
    private Lookup publisher;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
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
	
	public Lookup getPublisher() {
		return publisher;
	}
	
	public void setPublisher(Lookup publisher) {
		this.publisher = publisher;
	}
  
}