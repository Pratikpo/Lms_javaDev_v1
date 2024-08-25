package com.lgi.lms.dto;

import java.time.LocalDate;

public class LeadSearchRequest {
	
	private String searchField;
	private String searchValue;
	private LocalDate fromDate;
	private LocalDate toDate;
	private Integer policyTypeId;
	private Integer expiryDays;
	private String imdCode;
	private Integer branchId;
	private String leadType;
	private Integer statusId;
	private Integer dispositionId;
	private Integer subDispositionId;
	private Integer telecallerUserId;
	private Integer pinned;
	
	public String getSearchField() {
		return searchField;
	}
	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	public Integer getPolicyTypeId() {
		return policyTypeId;
	}
	public void setPolicyTypeId(Integer policyTypeId) {
		this.policyTypeId = policyTypeId;
	}
	public Integer getExpiryDays() {
		return expiryDays;
	}
	public void setExpiryDays(Integer expiryDays) {
		this.expiryDays = expiryDays;
	}
	public String getImdCode() {
		return imdCode;
	}
	public void setImdCode(String imdCode) {
		this.imdCode = imdCode;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public String getLeadType() {
		return leadType;
	}
	public void setLeadType(String leadType) {
		this.leadType = leadType;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Integer getDispositionId() {
		return dispositionId;
	}
	public void setDispositionId(Integer dispositionId) {
		this.dispositionId = dispositionId;
	}
	public Integer getSubDispositionId() {
		return subDispositionId;
	}
	public void setSubDispositionId(Integer subDispositionId) {
		this.subDispositionId = subDispositionId;
	}
	public Integer getTelecallerUserId() {
		return telecallerUserId;
	}
	public void setTelecallerUserId(Integer telecallerUserId) {
		this.telecallerUserId = telecallerUserId;
	}
	public Integer getPinned() {
		return pinned;
	}
	public void setPinned(Integer pinned) {
		this.pinned = pinned;
	}

}
