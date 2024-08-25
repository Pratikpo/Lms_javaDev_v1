package com.lgi.lms.model;

import java.time.LocalDateTime;

public class PolicyMaster { 

	private Long Id;
	private String leadId;
	private String customerName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String imdCode;
	private Lookup leadOwner;
	
	private Lookup leadSource;
	private Lookup branch;
	private String policyNumber;
	private Lookup policyStatus;
	private String policyEndDate;
	private String email;
	private String mobileNumber;
	private String leadType;
	private Lookup status;
	private LocalDateTime createdOn;
	private Lookup productType;
	private Lookup policyType;
	private String premium;
	private String lastInsuranceCompany;
	private Lookup disposition;
	private Lookup subDisposition;
	private String leadDevice;
	
	private LocalDateTime updatedOn;
	private String make;
	private String model;
	private String variant;
	private String registrationNumber;
	private String chassisNumber;
	private String engineNumber;
	private LocalDateTime registrationDate;
	private String manufacturingYear;
	private String manufacturingMonth;
	private String fuelType;
	private String rto;
	private String addOnCovers;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getLeadId() {
		return leadId;
	}
	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getImdCode() {
		return imdCode;
	}
	public void setImdCode(String imdCode) {
		this.imdCode = imdCode;
	}
	public Lookup getLeadOwner() {
		return leadOwner;
	}
	public void setLeadOwner(Lookup leadOwner) {
		this.leadOwner = leadOwner;
	}
	public Lookup getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(Lookup leadSource) {
		this.leadSource = leadSource;
	}
	public Lookup getBranch() {
		return branch;
	}
	public void setBranch(Lookup branch) {
		this.branch = branch;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Lookup getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(Lookup policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getLeadType() {
		return leadType;
	}
	public void setLeadType(String leadType) {
		this.leadType = leadType;
	}
	public Lookup getStatus() {
		return status;
	}
	public void setStatus(Lookup status) {
		this.status = status;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public Lookup getProductType() {
		return productType;
	}
	public void setProductType(Lookup productType) {
		this.productType = productType;
	}
	public Lookup getPolicyType() {
		return policyType;
	}
	public void setPolicyType(Lookup policyType) {
		this.policyType = policyType;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getLastInsuranceCompany() {
		return lastInsuranceCompany;
	}
	public void setLastInsuranceCompany(String lastInsuranceCompany) {
		this.lastInsuranceCompany = lastInsuranceCompany;
	}
	public Lookup getDisposition() {
		return disposition;
	}
	public void setDisposition(Lookup disposition) {
		this.disposition = disposition;
	}
	public Lookup getSubDisposition() {
		return subDisposition;
	}
	public void setSubDisposition(Lookup subDisposition) {
		this.subDisposition = subDisposition;
	}
	public String getLeadDevice() {
		return leadDevice;
	}
	public void setLeadDevice(String leadDevice) {
		this.leadDevice = leadDevice;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getManufacturingYear() {
		return manufacturingYear;
	}
	public void setManufacturingYear(String manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}
	public String getManufacturingMonth() {
		return manufacturingMonth;
	}
	public void setManufacturingMonth(String manufacturingMonth) {
		this.manufacturingMonth = manufacturingMonth;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getRto() {
		return rto;
	}
	public void setRto(String rto) {
		this.rto = rto;
	}
	public String getAddOnCovers() {
		return addOnCovers;
	}
	public void setAddOnCovers(String addOnCovers) {
		this.addOnCovers = addOnCovers;
	}
	public String getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(String policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	
	
}
