package com.lgi.lms.model.rowmapper.crmRowmapper;

import com.lgi.lms.model.crm.CRMLeadDetails;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CRMLeadDetailsRowMapper implements RowMapper<CRMLeadDetails> {
    @Override
    public CRMLeadDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        CRMLeadDetails leadDetails = new CRMLeadDetails();
        leadDetails.setId(rs.getLong("id"));
        leadDetails.setAadharCardNo(rs.getString("aadhar_card_no"));
        leadDetails.setAssociationMembershipExpiryDate(rs.getDate("association_membership_expiry_date") != null ?
                rs.getDate("association_membership_expiry_date").toLocalDate() : null);
        leadDetails.setAssociationMembershipNo(rs.getString("association_membership_no"));
        leadDetails.setCampaignCode(rs.getString("campaign_code"));
        leadDetails.setCountry(rs.getString("country"));
        leadDetails.setCurrentOdometerReadings(rs.getString("current_odometer_readings"));
        leadDetails.setDateOfBirth(rs.getDate("date_of_birth") != null ?
                rs.getDate("date_of_birth").toLocalDate() : null);
        leadDetails.setLeadDevice(rs.getString("lead_device"));
        leadDetails.setDrivingExperience(rs.getString("driving_experience"));
        leadDetails.setFamilyMembersCount(rs.getInt("family_members_count"));
        leadDetails.setFamilyMembersDriveVehicleCount(rs.getInt("family_members_drive_vehicle_count"));
        leadDetails.setFirstName(rs.getString("first_name"));
        leadDetails.setGender(rs.getInt("gender"));
        leadDetails.setGrossAnnualIncome(rs.getString("gross_annual_income"));
        leadDetails.setIsDrivingLicense(rs.getString("is_driving_license"));
        leadDetails.setIsMemberOfAutoAssociation(rs.getString("is_member_of_auto_association"));
        leadDetails.setIsOtp(rs.getString("is_otp"));
        leadDetails.setIsPaymentStatus(rs.getString("is_payment_status"));
        leadDetails.setMiddleName(rs.getString("middle_name"));
        leadDetails.setLicenceType(rs.getString("licence_type"));
        leadDetails.setLossOfPersonalBelongings(rs.getString("loss_of_personal_belongings"));
        leadDetails.setManufacturingMonth(rs.getInt("manufacturing_month"));
        leadDetails.setMaritalStatus(rs.getString("marital_status"));
        leadDetails.setNameOfAssociation(rs.getString("name_of_association"));
        leadDetails.setNewPolicyNumber(rs.getString("new_policy_numeber"));
        leadDetails.setNewPolicyPolicyEndDate(rs.getDate("new_policy_policy_end_date") != null ?
                rs.getDate("new_policy_policy_end_date").toLocalDate() : null);
        leadDetails.setNewPolicyPolicyStartDate(rs.getDate("new_policy_policy_start_date") != null ?
                rs.getDate("new_policy_policy_start_date").toLocalDate() : null);
        leadDetails.setNewPolicyPremiumAmount(rs.getString("new_policy_premium_amount"));
        leadDetails.setOccupation(rs.getString("occupation"));
        leadDetails.setOtherOccupation(rs.getString("other_occupation"));
        leadDetails.setOtherSubOccupation(rs.getString("other_sub_occupation"));
        leadDetails.setOwnedCarsCount(rs.getString("owned_cars_count"));
        leadDetails.setOwnedTwoWheelersCount(rs.getString("owned_two_wheelers_count"));
        leadDetails.setPanCardNo(rs.getString("pan_card_no"));
        leadDetails.setPayForDistance(rs.getString("pay_for_distance"));
        leadDetails.setQualification(rs.getString("qualification"));
        leadDetails.setQuotationNo(rs.getString("quotation_no"));
        leadDetails.setReferAndEarn(rs.getString("refer_and_earn"));
        leadDetails.setResidenceType(rs.getString("residence_type"));
        leadDetails.setSubOccupation(rs.getString("sub_occupation"));
        leadDetails.setTransactionNo(rs.getString("transaction_no"));
        leadDetails.setUtmUrl(rs.getString("utm_url"));
        leadDetails.setVoluntaryDeductable(rs.getString("voluntary_deductable"));
        leadDetails.setProductLeadId(rs.getInt("product_lead_id"));


        return leadDetails;
    }
}
