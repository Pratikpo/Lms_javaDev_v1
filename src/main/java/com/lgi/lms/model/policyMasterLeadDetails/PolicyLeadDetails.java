package com.lgi.lms.model.policyMasterLeadDetails;

public class PolicyLeadDetails {
    private LeadDetailsHeader leadDetailsHeader;
    private PersonalDetails personalDetails;
    private PreviousPolicyDetails previousPolicyDetails;
    private VehicleDetails vehicleDetails;
    private ContactDetails contactDetails;
    private AddressDetails addressDetails;
    private IdentificationDetails identificationDetails;
    private OccupationDetails occupationDetails;
    private LicenseDetails licenseDetails;
    private LeadDetails leadDetails;

    public LeadDetailsHeader getLeadDetailsHeader() {
        return leadDetailsHeader;
    }

    public void setLeadDetailsHeader(LeadDetailsHeader leadDetailsHeader) {
        this.leadDetailsHeader = leadDetailsHeader;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public PreviousPolicyDetails getPreviousPolicyDetails() {
        return previousPolicyDetails;
    }

    public void setPreviousPolicyDetails(PreviousPolicyDetails previousPolicyDetails) {
        this.previousPolicyDetails = previousPolicyDetails;
    }

    public VehicleDetails getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(VehicleDetails vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    public IdentificationDetails getIdentificationDetails() {
        return identificationDetails;
    }

    public void setIdentificationDetails(IdentificationDetails identificationDetails) {
        this.identificationDetails = identificationDetails;
    }

    public OccupationDetails getOccupationDetails() {
        return occupationDetails;
    }

    public void setOccupationDetails(OccupationDetails occupationDetails) {
        this.occupationDetails = occupationDetails;
    }

    public LicenseDetails getLicenseDetails() {
        return licenseDetails;
    }

    public void setLicenseDetails(LicenseDetails licenseDetails) {
        this.licenseDetails = licenseDetails;
    }

    public LeadDetails getLeadDetails() {
        return leadDetails;
    }

    public void setLeadDetails(LeadDetails leadDetails) {
        this.leadDetails = leadDetails;
    }
}