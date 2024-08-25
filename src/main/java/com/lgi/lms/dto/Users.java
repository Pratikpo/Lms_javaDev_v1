package com.lgi.lms.dto;

import java.time.LocalDateTime;

public class Users {
    private Long id;
    private String employeeCode;
    private String code;
    private String fullName;
    private String username;
    private String password;
    private String otp;
    private LocalDateTime otpValidUpto;
    private Integer loginAttempts;
    private LocalDateTime lockUpto;
    private String email;
    private String mobileNo;
    private String name;
    private Integer roleId;
    private Integer leadVerticalId;
    private Integer zoneCovered;
    private Integer stateCovered;
    private Integer districtCovered;
    private Integer branchCovered;
    private Integer teamCovered;
    private String languageKnown;
    private Integer parentId;
    private String imdCode;
    private String assignProduct;
    private Integer defaultProduct;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String isActive;
    private Integer isDeleted;
    private LocalDateTime deletedAt;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public LocalDateTime getOtpValidUpto() {
		return otpValidUpto;
	}
	public void setOtpValidUpto(LocalDateTime otpValidUpto) {
		this.otpValidUpto = otpValidUpto;
	}
	public Integer getLoginAttempts() {
		return loginAttempts;
	}
	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}
	public LocalDateTime getLockUpto() {
		return lockUpto;
	}
	public void setLockUpto(LocalDateTime lockUpto) {
		this.lockUpto = lockUpto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getLeadVerticalId() {
		return leadVerticalId;
	}
	public void setLeadVerticalId(Integer leadVerticalId) {
		this.leadVerticalId = leadVerticalId;
	}
	public Integer getZoneCovered() {
		return zoneCovered;
	}
	public void setZoneCovered(Integer zoneCovered) {
		this.zoneCovered = zoneCovered;
	}
	public Integer getStateCovered() {
		return stateCovered;
	}
	public void setStateCovered(Integer stateCovered) {
		this.stateCovered = stateCovered;
	}
	public Integer getDistrictCovered() {
		return districtCovered;
	}
	public void setDistrictCovered(Integer districtCovered) {
		this.districtCovered = districtCovered;
	}
	public Integer getBranchCovered() {
		return branchCovered;
	}
	public void setBranchCovered(Integer branchCovered) {
		this.branchCovered = branchCovered;
	}
	public Integer getTeamCovered() {
		return teamCovered;
	}
	public void setTeamCovered(Integer teamCovered) {
		this.teamCovered = teamCovered;
	}
	public String getLanguageKnown() {
		return languageKnown;
	}
	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getImdCode() {
		return imdCode;
	}
	public void setImdCode(String imdCode) {
		this.imdCode = imdCode;
	}
	public String getAssignProduct() {
		return assignProduct;
	}
	public void setAssignProduct(String assignProduct) {
		this.assignProduct = assignProduct;
	}
	public Integer getDefaultProduct() {
		return defaultProduct;
	}
	public void setDefaultProduct(Integer defaultProduct) {
		this.defaultProduct = defaultProduct;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
      
}