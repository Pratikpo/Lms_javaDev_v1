package com.lgi.lms.conf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lgi.lms.model.policyMasterLeadDetails.*;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class PolicyLeadDetailsFormatter {
    private final ObjectMapper objectMapper;
    private final JdbcTemplate jdbcTemplate;

    public PolicyLeadDetailsFormatter(ObjectMapper objectMapper, JdbcTemplate jdbcTemplate) {
        this.objectMapper = objectMapper;
        this.jdbcTemplate = jdbcTemplate;
    }


    public String formatPolicyLeadDetails(PolicyLeadDetails details) {
        ArrayNode rootArray = objectMapper.createArrayNode();


        addLeadDetailsHeader(rootArray, details.getLeadDetailsHeader());
        addPersonalDetails(rootArray, details.getPersonalDetails());
        addPreviousPolicyDetails(rootArray, details.getPreviousPolicyDetails());
        addVehicleDetails(rootArray, details.getVehicleDetails());
        addContactDetails(rootArray, details.getContactDetails());
        addAddressDetails(rootArray, details.getAddressDetails());
        addIdentificationDetails(rootArray, details.getIdentificationDetails());
        addOccupationDetails(rootArray, details.getOccupationDetails());
        addLicenseDetails(rootArray, details.getLicenseDetails());
        addLeadDetails(rootArray, details.getLeadDetails());

        return rootArray.toString();
    }

    private void addPersonalDetails(ArrayNode rootArray, PersonalDetails details) {
        ObjectNode section = createSection("Personal Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Product Name", details.getProductName());
        addField(fields, "Device Type", details.getDeviceType());
        addField(fields, "Device Keyword", details.getDeviceKeyword());
        addField(fields, "Transaction Number", details.getTransactionNumber());
        addField(fields, "Quote Number", details.getQuoteNumber());
        addField(fields, "Own Damage Premium Amount", formatCurrency(details.getOwnDamagePremiumAmount()));
        addField(fields, "New Policy Start Date", formatDate(details.getNewPolicyStartDate()));
        addField(fields, "New Policy End Date", formatDate(details.getNewPolicyEndDate()));
        addField(fields, "GWP", details.getGwp());
        addField(fields, "Current Individual Holdings", details.getCurrentIndividualHoldings());
        addField(fields, "No Policy Deductible", details.getNoPolicyDeductible());
        addField(fields, "Policy Tenure", details.getPolicyTenure());
        addField(fields, "Policy Premium", formatCurrency(details.getPolicyPremium()));


        rootArray.add(section);
    }

    private void addPreviousPolicyDetails(ArrayNode rootArray, PreviousPolicyDetails details) {
        ObjectNode section = createSection("Previous Policy Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Previous Policy Number", details.getPreviousPolicyNumber());
        addField(fields, "Previous Policy Expiry Date", formatDate(details.getPreviousPolicyExpiryDate()));
        addField(fields, "Previous Policy Premium Amount", formatCurrency(details.getPreviousPolicyPremiumAmount()));
        addField(fields, "No Previous Policy Start Date (%)", details.getNoPreviousPolicyStartDate());
        addField(fields, "Previous Policy End Date (%)", details.getPreviousPolicyEndDate());

        rootArray.add(section);
    }

    private void addVehicleDetails(ArrayNode rootArray, VehicleDetails details) {
        ObjectNode section = createSection("Vehicle Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Vehicle Make", details.getVehicleMake());
        addField(fields, "Vehicle Model", details.getVehicleModel());
        addField(fields, "Vehicle Variant", details.getVehicleVariant());
        addField(fields, "Fuel Type", details.getFuelType());
        addField(fields, "Vehicle Registration Number", details.getVehicleRegistrationNumber());
        addField(fields, "Registration Date", formatDate(details.getRegistrationDate()));
        addField(fields, "Manufacture Year", details.getManufactureYear());
        addField(fields, "Engine Number", details.getEngineNumber());
        addField(fields, "Chassis Number", details.getChassisNumber());

        rootArray.add(section);
    }

    private void addContactDetails(ArrayNode rootArray, ContactDetails details) {
        ObjectNode section = createSection("Contact Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Lead ID", details.getLeadId());
        addField(fields, "First Name", details.getFirstName());
        addField(fields, "Last Name", details.getLastName());
        addField(fields, "Mobile Number", details.getMobileNumber());
        addField(fields, "Email", details.getEmail());
        addField(fields, "Date Of Birth", formatDate(details.getDateOfBirth()));
        addField(fields, "Created On", formatDateTime(details.getCreatedOn()));
        addField(fields, "Modified On", formatDateTime(details.getModifiedOn()));

        rootArray.add(section);
    }

    private void addAddressDetails(ArrayNode rootArray, AddressDetails details) {
        ObjectNode section = createSection("Address Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Address Line 1", details.getAddressLine1());
        addField(fields, "Address Line 2", details.getAddressLine2());
        addField(fields, "Address Line 3", details.getAddressLine3());
        addField(fields, "City", details.getCity());
        addField(fields, "State/Province", details.getStateProvince());
        addField(fields, "Country", details.getCountry());
        addField(fields, "Pin Code", details.getPinCode());

        rootArray.add(section);
    }

    private void addIdentificationDetails(ArrayNode rootArray, IdentificationDetails details) {
        ObjectNode section = createSection("Identification Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Date of Birth", formatDate(details.getDateOfBirth()));
        addField(fields, "Pan Card Number", details.getPanCardNumber());
        addField(fields, "Aadhar Card", details.getAadharCard());
        addField(fields, "Gender", details.getGender());

        rootArray.add(section);
    }

    private void addOccupationDetails(ArrayNode rootArray, OccupationDetails details) {
        ObjectNode section = createSection("Occupation Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Occupation", details.getOccupation());
        addField(fields, "Sub-Occupation", details.getSubOccupation());

        rootArray.add(section);
    }

    private void addLicenseDetails(ArrayNode rootArray, LicenseDetails details) {
        ObjectNode section = createSection("License Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Do You Have A Valid Driving License?", details.getValidDrivingLicense());
        addField(fields, "Are You A Member Of Any Automobile Association of India?", details.getAutomobileAssociationMember());

        rootArray.add(section);
    }

    private void addLeadDetails(ArrayNode rootArray, LeadDetails details) {
        ObjectNode section = createSection("Lead Details", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Campaign Source", details.getCampaignSource());
        addField(fields, "Duplicate Lead", details.getDuplicateLead());
        addField(fields, "Prevented Duplication", details.getPreventedDuplication());
        addField(fields, "Expired Leads", details.getExpiredLeads());
        addField(fields, "Last Disposed On", formatDateTime(details.getLastDisposedOn()));
        addField(fields, "UTM URL", details.getUtmUrl());
        addField(fields, "Unsubscribe URL", details.getUnsubscribeUrl());
        addField(fields, "Service Requests", details.getServiceRequests());
        addField(fields, "Service Preference", details.getServicePreference());
        addField(fields, "Indicator Call Reference Id", details.getIndicatorCallReferenceId());
        addField(fields, "Dealer Campaign Owner", details.getDealerCampaignOwner());

        rootArray.add(section);
    }
    private void addLeadDetailsHeader(ArrayNode rootArray, LeadDetailsHeader header) {
        ObjectNode section = createSection("Lead Details Header", 12);
        ArrayNode fields = section.putArray("fields");

        addField(fields, "Lead Id", header.getLeadId());
        addField(fields, "Customer", lookupCustomer(header.getCustomerId()));
        addField(fields, "Email Id", header.getEmailId());
        addField(fields, "Product Type", lookupProductType(header.getProductTypeId()));
        addField(fields, "Policy Type", lookupPolicyType(header.getPolicyTypeId()));
        addField(fields, "Policy Status", header.getPolicyStatus());
        addField(fields,"Lead Type",header.getLeadType());
        addField(fields,"Lead Status",lookupLeadStatus(header.getStatus()));


        rootArray.add(section);
    }

    private ObjectNode createSection(String title, int isDividedRatio) {
        ObjectNode section = objectMapper.createObjectNode();
        section.put("isDividedRatio", isDividedRatio);
        section.put("title", title);
        return section;
    }

    private void addField(ArrayNode fields, String label, String value) {
        ObjectNode field = objectMapper.createObjectNode();
        field.put("label", label);
        field.put("value", value != null ? value : "...");
        fields.add(field);
    }

    private String formatDate(LocalDate date) {
        return date != null ? date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) : "...";
    }

    private String formatDateTime(LocalDateTime dateTime) {
        return dateTime != null ? dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a")) : "...";
    }

    private String formatCurrency(BigDecimal amount) {
        return amount != null ? String.format("₹ %,.0f", amount) : "...";
    }

    private String lookupCustomer(String customerId) {
        String sql = "SELECT customer_name FROM leaddetails WHERE customer_id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, String.class, customerId);
        } catch (EmptyResultDataAccessException e) {
            return "Unknown Customer";
        }
    }

    private String lookupProductType(Long productTypeId) {
        String sql = "SELECT label FROM product_type WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, String.class, productTypeId);
        } catch (EmptyResultDataAccessException e) {
            return "Unknown Product Type";
        }
    }

    private String lookupPolicyType(Long policyTypeId) {
        String sql = "SELECT policy_type FROM lead_policy_status WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, String.class, policyTypeId);
        } catch (EmptyResultDataAccessException e) {
            return "Unknown Policy Type";
        }
    }
    private String lookupLeadStatus(Long status){
        String sql="SELECT lable FROM status WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, String.class, status);
        } catch (EmptyResultDataAccessException e) {
            return "Unknown Lead Status";
        }
    }
}