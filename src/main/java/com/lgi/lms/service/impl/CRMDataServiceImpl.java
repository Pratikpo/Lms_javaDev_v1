package com.lgi.lms.service.impl;

import com.lgi.lms.controller.CRMDataController;
import com.lgi.lms.dto.InsuranceRequestDTO;
import com.lgi.lms.model.crm.CRMLeadDetails;
import com.lgi.lms.model.crm.CRMPolicyMaster;
import com.lgi.lms.model.crm.CRMTwowheelerMaster;

import com.lgi.lms.repository.crmRepository.CRMLeadDetailsRepository;
import com.lgi.lms.repository.crmRepository.CRMPolicyMasterRepository;
import com.lgi.lms.repository.crmRepository.CRMTwoWheelerMasterRepository;
import com.lgi.lms.service.CRMDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CRMDataServiceImpl implements CRMDataService {
    private static final Logger logger = LoggerFactory.getLogger(CRMDataController.class);
    private final CRMLeadDetailsRepository leadDetailsRepository;
    private final CRMPolicyMasterRepository policyMasterRepository;
    private final CRMTwoWheelerMasterRepository twowheelerMasterRepository;
    private final JdbcTemplate jdbcTemplate;

    public CRMDataServiceImpl(CRMLeadDetailsRepository leadDetailsRepository,
                              CRMPolicyMasterRepository policyMasterRepository,
                              CRMTwoWheelerMasterRepository twowheelerMasterRepository, JdbcTemplate jdbcTemplate) {
        this.leadDetailsRepository = leadDetailsRepository;
        this.policyMasterRepository = policyMasterRepository;
        this.twowheelerMasterRepository = twowheelerMasterRepository;
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    @Transactional
    public void processInsuranceData(InsuranceRequestDTO data) {
        String productName = data.getProductName().trim();
        logger.info("Processing insurance data for product: {}", productName);

        Integer productLeadId = getOrCreateProductId(productName);

        CRMLeadDetails leadDetails = mapToLeadDetails(data);
        leadDetails.setProductLeadId(productLeadId);
        leadDetailsRepository.save(leadDetails);
        logger.info("Saved lead details with product_lead_id: {}", productLeadId);

        if ("Private Car".equalsIgnoreCase(productName)) {
            CRMPolicyMaster policyMaster = mapToPolicyMaster(data);
            policyMasterRepository.save(policyMaster);
            logger.info("Saved policy master for Private Car");
        } else if ("Bike".equalsIgnoreCase(productName)) {
            CRMTwowheelerMaster twowheelerMaster = mapToTwowheelerMaster(data);
            twowheelerMasterRepository.save(twowheelerMaster);
            logger.info("Saved two-wheeler master for Bike");
        } else {
            logger.info("Product {} doesn't require additional data save", productName);
        }
    }

    private Integer getOrCreateProductId(String productName) {
        String sql = "INSERT INTO policy_master (product_name) VALUES (?) " +
                "ON DUPLICATE KEY UPDATE product_name = VALUES(product_name); " +
                "SELECT id FROM policy_master WHERE product_name = ?;";

        jdbcTemplate.update("INSERT INTO policy_master (product_name) VALUES (?) " +
                "ON DUPLICATE KEY UPDATE product_name = VALUES(product_name)", productName);

        return jdbcTemplate.queryForObject("SELECT id FROM policy_master WHERE product_name = ?",
                Integer.class, productName);
    }


    private CRMLeadDetails mapToLeadDetails(InsuranceRequestDTO data) {
        CRMLeadDetails leadDetails = new CRMLeadDetails();

        leadDetails.setAadharCardNo(data.getAadharCardNo());
        leadDetails.setAssociationMembershipExpiryDate(data.getAssociationMembershipExpiryDate());
        leadDetails.setAssociationMembershipNo(data.getAssociationMembershipNo());
        leadDetails.setCampaignCode(data.getCampaignCode());
        leadDetails.setCountry(data.getCountry());
        leadDetails.setCurrentOdometerReadings(data.getCurrentOdometerReadings());
        leadDetails.setDateOfBirth(data.getDateOfBirth());
        leadDetails.setLeadDevice(data.getDeviceType());
        leadDetails.setDrivingExperience(data.getDrivingExperience());
        leadDetails.setFamilyMembersCount(data.getFamilyMembersCount());
        leadDetails.setFamilyMembersDriveVehicleCount(data.getFamilyMembersDriveVehicleCount());
        leadDetails.setFirstName(data.getFirstName());
        //leadDetails.setGender(data.getGender());
        leadDetails.setGrossAnnualIncome(data.getGrossAnnualIncome());
        //leadDetails.setIsDrivingLicense(data.getDrivingLicense() ? "Yes" : "No");
        //leadDetails.setIsMemberOfAutoAssociation(data.getMemberOfAutoAssociation() ? "Yes" : "No");
        //leadDetails.setIsOtp(data.getOTP() ? "Yes" : "No");
        leadDetails.setIsPaymentStatus(data.getIsPaymentStatus());
        leadDetails.setMiddleName(data.getLastName()); // Assuming LastName in DTO maps to MiddleName in LeadDetails
        leadDetails.setLicenceType(data.getLicenceType());
        leadDetails.setLossOfPersonalBelongings(data.getLossOfPersonalBelongings());
        leadDetails.setManufacturingMonth(data.getManufacturingMonth());

        leadDetails.setMaritalStatus(data.getMaritalStatus());


        leadDetails.setNameOfAssociation(data.getNameOfAssociation());
        leadDetails.setNewPolicyNumber(data.getNewPolicyNumber());
        leadDetails.setNewPolicyPolicyEndDate(data.getNewPolicyPolicyEndDate());
        leadDetails.setNewPolicyPolicyStartDate(data.getNewPolicyPolicyStartDate());
        leadDetails.setNewPolicyPremiumAmount(data.getNewPolicyPremiumAmount());
        leadDetails.setOccupation(data.getOccupation());
        leadDetails.setOtherOccupation(data.getOtherOccupation());
        leadDetails.setOtherSubOccupation(data.getOtherSubOccupation());
        leadDetails.setOwnedCarsCount(data.getOwnedCarsCount());
        leadDetails.setOwnedTwoWheelersCount(data.getOwnedTwoWheelersCount());
        leadDetails.setPanCardNo(data.getPanCardNo());
        leadDetails.setPayForDistance(data.getPayForDistance());
        leadDetails.setQualification(data.getQualification());
        leadDetails.setQuotationNo(data.getQuotationNo());
        leadDetails.setReferAndEarn(data.getReferAndEarn());
        leadDetails.setResidenceType(data.getResidenceType());
        leadDetails.setSubOccupation(data.getSubOccupation());
        leadDetails.setTransactionNo(data.getTransactionNo());
        leadDetails.setUtmUrl(data.getUtmUrl());
        leadDetails.setVoluntaryDeductable(data.getVoluntaryDeductable());
        return leadDetails;
    }

    private CRMPolicyMaster mapToPolicyMaster(InsuranceRequestDTO data) {
        CRMPolicyMaster policyMaster = new CRMPolicyMaster();
        policyMaster.setCustomerAddress1(data.getAddressLine1());
        policyMaster.setCustomerAddress2(data.getAddressLine2());
        policyMaster.setCustomerAddress3(data.getAddressLine3());
        policyMaster.setCategory(data.getCategory());
        policyMaster.setChassisNo(data.getChassisNo());
        policyMaster.setCustomerCity(data.getCity());
        policyMaster.setClaimAmountTotal(data.getClaimDuringLastYear());
        policyMaster.setEmailId(data.getEmail());
        policyMaster.setEngineNo(data.getEngineNo());
        policyMaster.setFuelType(data.getFuelType());
        policyMaster.setYom(data.getManufacturingYear().toString());
        policyMaster.setMobile1(data.getMobilePhone());
        policyMaster.setMobile2(data.getMobilePhone2());
        policyMaster.setCustomerPincode(Integer.parseInt(data.getPincode()));

        policyMaster.setTotalIdv(data.getPreviousPolicyIDVvalue());
        policyMaster.setInsuredName(data.getPreviousPolicyInsurerName());
        policyMaster.setPolicyNumber(data.getPreviousPolicyNumber());
        policyMaster.setTotalPremiumPayable(data.getPreviousPolicyPremiumAmount());
        policyMaster.setPolicyStartDate(data.getPreviousPolicyStartDate());
        policyMaster.setBiztype(data.getPreviousPolicyType());
        policyMaster.setLastyearNcb(data.getPreviousYearNCB());
        policyMaster.setProductName(data.getProductName());
        policyMaster.setRegiDate(data.getRegistrationDate());
        policyMaster.setRegiNo(data.getRegistrationNo());
        policyMaster.setRtoLocation(data.getRto());
        policyMaster.setState(data.getState());
        policyMaster.setMake(data.getVehicleMake());
        policyMaster.setModel(data.getVehicleModel());
        policyMaster.setModelVariant(data.getVehicleVariant());
        policyMaster.setVoluntaryDeductable(data.getVoluntaryDeductable());
        return policyMaster;
    }

    private CRMTwowheelerMaster mapToTwowheelerMaster(InsuranceRequestDTO data) {
        CRMTwowheelerMaster twowheelerMaster = new CRMTwowheelerMaster();
        twowheelerMaster.setCustomerAddress1(data.getAddressLine1());
        twowheelerMaster.setCustomerAddress2(data.getAddressLine2());
        twowheelerMaster.setCustomerAddress3(data.getAddressLine3());
        twowheelerMaster.setCategory(data.getCategory());
        twowheelerMaster.setChassisNo(data.getChassisNo());
        twowheelerMaster.setCustomerCity(data.getCity());
        twowheelerMaster.setClaimAmountTotal(data.getClaimDuringLastYear());
        twowheelerMaster.setEmailId(data.getEmail());
        twowheelerMaster.setEngineNo(data.getEngineNo());
        twowheelerMaster.setFuelType(data.getFuelType());
        twowheelerMaster.setYom(data.getManufacturingYear().toString());
        twowheelerMaster.setMobile1(data.getMobilePhone());
        twowheelerMaster.setMobile2(data.getMobilePhone2());
        twowheelerMaster.setCustomerPincode(Integer.parseInt(data.getPincode()));
        //twowheelerMaster.setPolicyEndDate(data.getPreviousPolicyEndDate().toString());
        twowheelerMaster.setTotalIdv(data.getPreviousPolicyIDVvalue());
        twowheelerMaster.setInsuredName(data.getPreviousPolicyInsurerName());
        twowheelerMaster.setPolicyNumber(data.getPreviousPolicyNumber());
        twowheelerMaster.setTotalPremiumPayable(data.getPreviousPolicyPremiumAmount());
        //twowheelerMaster.setPolicyStartDate(data.getPreviousPolicyStartDate().toString());
        twowheelerMaster.setBiztype(data.getPreviousPolicyType());
        twowheelerMaster.setRenewalNcb(data.getPreviousYearNCB());
        twowheelerMaster.setProductName(data.getProductName());
        twowheelerMaster.setDateofregistration(data.getRegistrationDate());
        twowheelerMaster.setRegiNo(data.getRegistrationNo());
        twowheelerMaster.setRtoLocation(data.getRto());
        twowheelerMaster.setState(data.getState());
        return twowheelerMaster;
    }
}