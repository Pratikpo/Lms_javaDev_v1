package com.lgi.lms.model.crm;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CRMPolicyMaster {
    private Long id;

    // Database Fields: customer_address1, customer_address2, customer_address3 - varchar(100)
    private String customerAddress1;
    private String customerAddress2;
    private String customerAddress3;

    // Database Field: category - varchar(100)
    private String category;

    // Database Field: chassis_no - varchar(100)
    private String chassisNo;

    // Database Field: customer_city - varchar(50)
    private String customerCity;

    // Database Field: claim_amount_total - varchar(11)
    private String claimAmountTotal;

    // Database Field: emailId - varchar(255)
    private String emailId;

    // Database Field: engine_no - varchar(100)
    private String engineNo;

    // Database Field: fuel_type - varchar(50)
    private String fuelType;

    // Database Field: yom - varchar(50)
    private String yom;

    // Database Fields: mobile1, mobile2 - varchar(15)
    private String mobile1;
    private String mobile2;

    // Database Field: customer_pincode - int
    private Integer customerPincode;




    // Database Field: total_idv - varchar(11)
    private String totalIdv;

    // Database Field: insured_name - varchar(100)
    private String insuredName;

    // Database Field: policy_Number - varchar(100)
    private String policyNumber;

    // Database Field: total_premium_payable - varchar(100)
    private String totalPremiumPayable;

    // Database Field: policy_start_date - varchar(100)
    private LocalDate policyStartDate; // Keep as String to store the full date in text format

    // Database Field: biztype - varchar(100)
    private String biztype;

    // Database Field: lastyear_ncb - varchar(11)
    private String lastyearNcb;

    // Database Field: product_name - varchar(100)
    private String productName;

    // Database Field: regi_date - date
    private LocalDate regiDate;

    // Database Field: regi_no - varchar(50)
    private String regiNo;

    // Database Field: rto_location - varchar(50)
    private String rtoLocation;

    // Database Field: state - varchar(100)
    private String state;

    // Database Field: make - varchar(50)
    private String make;

    // Database Field: model - varchar(50)
    private String model;

    // Database Field: model_variant - varchar(50)
    private String modelVariant;

    // Note: Field voluntaryDeductable was not mapped to a column, but if needed, it can be adjusted as per table fields
    private String voluntaryDeductable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerAddress1() {
        return customerAddress1;
    }

    public void setCustomerAddress1(String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }

    public String getCustomerAddress2() {
        return customerAddress2;
    }

    public void setCustomerAddress2(String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }

    public String getCustomerAddress3() {
        return customerAddress3;
    }

    public void setCustomerAddress3(String customerAddress3) {
        this.customerAddress3 = customerAddress3;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getClaimAmountTotal() {
        return claimAmountTotal;
    }

    public void setClaimAmountTotal(String claimAmountTotal) {
        this.claimAmountTotal = claimAmountTotal;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getYom() {
        return yom;
    }

    public void setYom(String yom) {
        this.yom = yom;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public Integer getCustomerPincode() {
        return customerPincode;
    }

    public void setCustomerPincode(Integer customerPincode) {
        this.customerPincode = customerPincode;
    }



    public String getTotalIdv() {
        return totalIdv;
    }

    public void setTotalIdv(String totalIdv) {
        this.totalIdv = totalIdv;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getTotalPremiumPayable() {
        return totalPremiumPayable;
    }

    public void setTotalPremiumPayable(String totalPremiumPayable) {
        this.totalPremiumPayable = totalPremiumPayable;
    }

    public LocalDate getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(LocalDate policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public String getBiztype() {
        return biztype;
    }

    public void setBiztype(String biztype) {
        this.biztype = biztype;
    }

    public String getLastyearNcb() {
        return lastyearNcb;
    }

    public void setLastyearNcb(String lastyearNcb) {
        this.lastyearNcb = lastyearNcb;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(LocalDate regiDate) {
        this.regiDate = regiDate;
    }

    public String getRegiNo() {
        return regiNo;
    }

    public void setRegiNo(String regiNo) {
        this.regiNo = regiNo;
    }

    public String getRtoLocation() {
        return rtoLocation;
    }

    public void setRtoLocation(String rtoLocation) {
        this.rtoLocation = rtoLocation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getModelVariant() {
        return modelVariant;
    }

    public void setModelVariant(String modelVariant) {
        this.modelVariant = modelVariant;
    }

    public String getVoluntaryDeductable() {
        return voluntaryDeductable;
    }

    public void setVoluntaryDeductable(String voluntaryDeductable) {
        this.voluntaryDeductable = voluntaryDeductable;
    }
}
