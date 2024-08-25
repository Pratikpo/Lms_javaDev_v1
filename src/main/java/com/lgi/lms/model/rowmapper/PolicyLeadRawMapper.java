package com.lgi.lms.model.rowmapper;

import com.lgi.lms.model.policyMasterLeadDetails.*;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

public class PolicyLeadRawMapper implements RowMapper<PolicyLeadDetails> {

    @Override
    public PolicyLeadDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        PolicyLeadDetails details = new PolicyLeadDetails();

        details.setLeadDetailsHeader(mapLeadDetailsHeader(rs));
        details.setPersonalDetails(mapPersonalDetails(rs));
        details.setPreviousPolicyDetails(mapPreviousPolicyDetails(rs));
        details.setVehicleDetails(mapVehicleDetails(rs));
        details.setContactDetails(mapContactDetails(rs));
        details.setAddressDetails(mapAddressDetails(rs));
        details.setIdentificationDetails(mapIdentificationDetails(rs));
        details.setOccupationDetails(mapOccupationDetails(rs));
        details.setLicenseDetails(mapLicenseDetails(rs));
        details.setLeadDetails(mapLeadDetails(rs));

        return details;
    }

    private PersonalDetails mapPersonalDetails(ResultSet rs) throws SQLException {
        PersonalDetails details = new PersonalDetails();
        details.setProductName(rs.getString("product_name"));
        details.setDeviceType(rs.getString("lead_device"));
        details.setDeviceKeyword(null); // Not available in the result set
        details.setTransactionNumber(null); // Not available in the result set
        details.setQuoteNumber(null); // Not available in the result set
        details.setOwnDamagePremiumAmount(null); // Not available in the result set
        details.setNewPolicyStartDate(rs.getObject("policy_start_date", LocalDate.class));
        details.setNewPolicyEndDate(rs.getObject("policy_end_date", LocalDate.class));
        details.setGwp(null); // Not available in the result set
        details.setCurrentIndividualHoldings(null); // Not available in the result set
        details.setNoPolicyDeductible(null); // Not available in the result set
        details.setPolicyTenure("1 YEAR"); // Assuming 1 year policy
        details.setPolicyPremium(null); // Not available in the result set
        return details;
    }

    private PreviousPolicyDetails mapPreviousPolicyDetails(ResultSet rs) throws SQLException {
        PreviousPolicyDetails details = new PreviousPolicyDetails();
        details.setPreviousPolicyNumber(rs.getString("policy_Number"));
        details.setPreviousPolicyExpiryDate(rs.getObject("policy_end_date", LocalDate.class));
        details.setPreviousPolicyPremiumAmount(null); // Not available in the result set
        details.setNoPreviousPolicyStartDate(null); // Not available in the result set
        details.setPreviousPolicyEndDate(null); // Not available in the result set
        return details;
    }

    private VehicleDetails mapVehicleDetails(ResultSet rs) throws SQLException {
        VehicleDetails details = new VehicleDetails();
        details.setVehicleMake(rs.getString("make"));
        details.setVehicleModel(rs.getString("model"));
        details.setVehicleVariant(rs.getString("model_variant"));
        details.setFuelType(rs.getString("fuel_type"));
        details.setVehicleRegistrationNumber(rs.getString("regi_number1"));
        details.setRegistrationDate(rs.getObject("regi_date", LocalDate.class));
        details.setManufactureYear(rs.getString("yom"));
        details.setEngineNumber(rs.getString("engine_no"));
        details.setChassisNumber(rs.getString("chassis_no"));
        return details;
    }

    private ContactDetails mapContactDetails(ResultSet rs) throws SQLException {
        ContactDetails details = new ContactDetails();
        details.setLeadId(rs.getString("product_lead_id"));
        details.setFirstName(rs.getString("first_name"));
        details.setLastName(rs.getString("last_name"));
        details.setMobileNumber(rs.getString("mobile1"));
        details.setEmail(rs.getString("emailId"));
        details.setDateOfBirth(null); // Not available in the result set
        details.setCreatedOn(null); // Not available in the result set
        details.setModifiedOn(rs.getObject("last_updated_date_time", LocalDateTime.class));
        return details;
    }

    private AddressDetails mapAddressDetails(ResultSet rs) throws SQLException {
        AddressDetails details = new AddressDetails();
        details.setAddressLine1(rs.getString("customer_address1"));
        details.setAddressLine2(rs.getString("customer_address2"));
        details.setAddressLine3(rs.getString("customer_address3"));
        details.setCity(rs.getString("customer_city"));
        details.setStateProvince(rs.getString("state"));
        details.setCountry("India"); // Assuming India
        details.setPinCode(rs.getString("customer_pincode"));
        return details;
    }

    private IdentificationDetails mapIdentificationDetails(ResultSet rs) throws SQLException {
        IdentificationDetails details = new IdentificationDetails();
        details.setDateOfBirth(null); // Not available in the result set
        details.setPanCardNumber(null); // Not available in the result set
        details.setAadharCard(null); // Not available in the result set
        details.setGender(null); // Not available in the result set
        return details;
    }

    private OccupationDetails mapOccupationDetails(ResultSet rs) throws SQLException {
        OccupationDetails details = new OccupationDetails();
        details.setOccupation(null); // Not available in the result set
        details.setSubOccupation(null); // Not available in the result set
        return details;
    }

    private LicenseDetails mapLicenseDetails(ResultSet rs) throws SQLException {
        LicenseDetails details = new LicenseDetails();
        details.setValidDrivingLicense(null); // Not available in the result set
        details.setAutomobileAssociationMember(null); // Not available in the result set
        return details;
    }

    private LeadDetails mapLeadDetails(ResultSet rs) throws SQLException {
        LeadDetails details = new LeadDetails();
        details.setCampaignSource(rs.getString("campaign"));
        details.setDuplicateLead("No"); // Assuming no duplicate lead
        details.setPreventedDuplication(null); // Not available in the result set
        details.setExpiredLeads(null); // Not available in the result set
        details.setLastDisposedOn(null); // Not available in the result set
        details.setUtmUrl(null); // Not available in the result set
        details.setUnsubscribeUrl(null); // Not available in the result set
        details.setServiceRequests(null); // Not available in the result set
        details.setServicePreference(null); // Not available in the result set
        details.setIndicatorCallReferenceId(null); // Not available in the result set
        details.setDealerCampaignOwner(null); // Not available in the result set
        return details;
    }
    private LeadDetailsHeader mapLeadDetailsHeader(ResultSet rs) throws SQLException {
        LeadDetailsHeader header = new LeadDetailsHeader();
        header.setLeadId(rs.getString("product_lead_id"));
        header.setCustomerId(rs.getString("customer_id"));
        header.setEmailId(rs.getString("emailId"));
        header.setProductTypeId(rs.getLong("product_type_id"));
        header.setPolicyTypeId(rs.getLong("policy_type_id"));
        header.setPolicyStatus(rs.getString("policy_status"));
        header.setLeadType(rs.getString("biztype"));
        header.setStatus(rs.getLong("status"));
        return header;
    }
}