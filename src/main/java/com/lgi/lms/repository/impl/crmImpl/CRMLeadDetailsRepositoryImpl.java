package com.lgi.lms.repository.impl.crmImpl;

import com.lgi.lms.dto.InsuranceRequestDTO;
import com.lgi.lms.model.crm.CRMLeadDetails;
import com.lgi.lms.repository.crmRepository.CRMLeadDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public class CRMLeadDetailsRepositoryImpl implements CRMLeadDetailsRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public CRMLeadDetailsRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(CRMLeadDetails leadDetails) {
        String sql = "INSERT INTO lead_details (product_lead_id,aadhar_card_no, association_membership_expiry_date, " +
                "association_membership_no, campaign_code, country, current_odometer_readings, date_of_birth, " +
                "lead_device, driving_experience, family_members_count, family_members_drive_vehicle_count, " +
                "first_name, gender, gross_annual_income, is_driving_license, is_member_of_auto_association, " +
                "is_otp, is_payment_status, middle_name, licence_type, loss_of_personal_belongings, " +
                "manufacturing_month, marital_status, name_of_association, new_policy_numeber, " +
                "new_policy_policy_end_date, new_policy_policy_start_date, new_policy_premium_amount, " +
                "occupation, other_occupation, other_sub_occupation, owned_cars_count, owned_two_wheelers_count, " +
                "pan_card_no, pay_for_distance, qualification, quotation_no, refer_and_earn, residence_type, " +
                "sub_occupation, transaction_no, utm_url, voluntary_deductable) " +
                "VALUES (:productLeadId,:aadharCardNo, :associationMembershipExpiryDate, :associationMembershipNo, " +
                ":campaignCode, :country, :currentOdometerReadings, :dateOfBirth, :leadDevice, :drivingExperience, " +
                ":familyMembersCount, :familyMembersDriveVehicleCount, :firstName, :gender, :grossAnnualIncome, " +
                ":isDrivingLicense, :isMemberOfAutoAssociation, :isOtp, :isPaymentStatus, :middleName, " +
                ":licenceType, :lossOfPersonalBelongings, :manufacturingMonth, :maritalStatus, :nameOfAssociation, " +
                ":newPolicyNumber, :newPolicyPolicyEndDate, :newPolicyPolicyStartDate, :newPolicyPremiumAmount, " +
                ":occupation, :otherOccupation, :otherSubOccupation, :ownedCarsCount, :ownedTwoWheelersCount, " +
                ":panCardNo, :payForDistance, :qualification, :quotationNo, :referAndEarn, :residenceType, " +
                ":subOccupation, :transactionNo, :utmUrl, :voluntaryDeductable)";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("productLeadId", leadDetails.getProductLeadId());
        params.addValue("aadharCardNo", leadDetails.getAadharCardNo());
        params.addValue("associationMembershipExpiryDate", leadDetails.getAssociationMembershipExpiryDate() != null ?
                Date.valueOf(leadDetails.getAssociationMembershipExpiryDate()) : null);
        params.addValue("associationMembershipNo", leadDetails.getAssociationMembershipNo());
        params.addValue("campaignCode", leadDetails.getCampaignCode());
        params.addValue("country", leadDetails.getCountry());
        params.addValue("currentOdometerReadings", leadDetails.getCurrentOdometerReadings());
        params.addValue("dateOfBirth", leadDetails.getDateOfBirth() != null ?
                Date.valueOf(leadDetails.getDateOfBirth()) : null);
        params.addValue("leadDevice", leadDetails.getLeadDevice());
        params.addValue("drivingExperience", leadDetails.getDrivingExperience());
        params.addValue("familyMembersCount", leadDetails.getFamilyMembersCount());
        params.addValue("familyMembersDriveVehicleCount", leadDetails.getFamilyMembersDriveVehicleCount());
        params.addValue("firstName", leadDetails.getFirstName());
        params.addValue("gender", leadDetails.getGender());
        params.addValue("grossAnnualIncome", leadDetails.getGrossAnnualIncome());
        params.addValue("isDrivingLicense", leadDetails.getIsDrivingLicense());
        params.addValue("isMemberOfAutoAssociation", leadDetails.getIsMemberOfAutoAssociation());
        params.addValue("isOtp", leadDetails.getIsOtp());
        params.addValue("isPaymentStatus", leadDetails.getIsPaymentStatus());
        params.addValue("middleName", leadDetails.getMiddleName());
        params.addValue("licenceType", leadDetails.getLicenceType());
        params.addValue("lossOfPersonalBelongings", leadDetails.getLossOfPersonalBelongings());
        params.addValue("manufacturingMonth", leadDetails.getManufacturingMonth());
        params.addValue("maritalStatus", leadDetails.getMaritalStatus());
        params.addValue("nameOfAssociation", leadDetails.getNameOfAssociation());
        params.addValue("newPolicyNumber", leadDetails.getNewPolicyNumber());
        params.addValue("newPolicyPolicyEndDate", leadDetails.getNewPolicyPolicyEndDate() != null ?
                Date.valueOf(leadDetails.getNewPolicyPolicyEndDate()) : null);
        params.addValue("newPolicyPolicyStartDate", leadDetails.getNewPolicyPolicyStartDate() != null ?
                Date.valueOf(leadDetails.getNewPolicyPolicyStartDate()) : null);
        params.addValue("newPolicyPremiumAmount", leadDetails.getNewPolicyPremiumAmount());
        params.addValue("occupation", leadDetails.getOccupation());
        params.addValue("otherOccupation", leadDetails.getOtherOccupation());
        params.addValue("otherSubOccupation", leadDetails.getOtherSubOccupation());
        params.addValue("ownedCarsCount", leadDetails.getOwnedCarsCount());
        params.addValue("ownedTwoWheelersCount", leadDetails.getOwnedTwoWheelersCount());
        params.addValue("panCardNo", leadDetails.getPanCardNo());
        params.addValue("payForDistance", leadDetails.getPayForDistance());
        params.addValue("qualification", leadDetails.getQualification());
        params.addValue("quotationNo", leadDetails.getQuotationNo());
        params.addValue("referAndEarn", leadDetails.getReferAndEarn());
        params.addValue("residenceType", leadDetails.getResidenceType());
        params.addValue("subOccupation", leadDetails.getSubOccupation());
        params.addValue("transactionNo", leadDetails.getTransactionNo());
        params.addValue("utmUrl", leadDetails.getUtmUrl());
        params.addValue("voluntaryDeductable", leadDetails.getVoluntaryDeductable());

        jdbcTemplate.update(sql, params);
    }
}
