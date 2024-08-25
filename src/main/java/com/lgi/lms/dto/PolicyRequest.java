package com.lgi.lms.dto;

import java.util.List;

public class PolicyRequest {
    private String businessType;
    private int policyTypeId;
    private int leadTypeId;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailAddress;
    private int productTypeId;
    private String policyNumber; // Only for renew
    private String insuranceCompany; // Only for renew
    private int policyStatusId; // Only for renew
    private String addOnCovers; // Only for renew
    private String make;
    private String model;
    private String variant;
    private String manufacturingYear;

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public int getPolicyTypeId() {
        return policyTypeId;
    }

	public void setPolicyTypeId(int policyTypeId) {
        this.policyTypeId = policyTypeId;
    }

    public int getLeadTypeId() {
        return leadTypeId;
    }

    public void setLeadTypeId(int leadTypeId) {
        this.leadTypeId = leadTypeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public int getPolicyStatusId() {
        return policyStatusId;
    }

    public void setPolicyStatusId(int policyStatusId) {
        this.policyStatusId = policyStatusId;
    }

    public String getAddOnCovers() {
        return addOnCovers;
    }

    public void setAddOnCovers(String addOnCovers) {
        this.addOnCovers = addOnCovers;
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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getManufacturingMonth() {
        return manufacturingMonth;
    }

    public void setManufacturingMonth(int manufacturingMonth) {
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
    
    
    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    private String registrationNumber;
    private String chassisNumber;
    private String engineNumber;
    private String registrationDate;
    private int manufacturingMonth;
    private String fuelType;
    private String rto;
}
