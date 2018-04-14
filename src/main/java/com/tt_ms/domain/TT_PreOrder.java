package com.tt_ms.domain;

import java.util.Date;

public class TT_PreOrder {
    private String id;

    private String preorderNumber;

    private String cusId;

    private String cusName;

    private String identifyType;

    private String identifyId;

    private String mobilephone;

    private String cusType;

    private String invoiceCusName;

    private String carDemioName;

    private String carModelName;

    private String configure;

    private String inColor;

    private String outColor;

    private String intentionLevel;

    private Boolean buywayFirst;

    private Boolean buywayLoyal;

    private Boolean buywayDisplace;

    private Boolean buywayBigCus;

    private String originPlace;

    private Integer buyAccount;

    private String licensePlateProperty;

    private String licensePlateGetway;

    private Long salePrice;

    private Long prepaidAmount;

    private Long invoicePrice;

    private String payWay;

    private Date payRestMoneyDay;

    private Date expectedArrivalTime;

    private Date getCarDate;

    private Boolean addedInsurance;

    private Boolean addedJz;

    private String addedRemark1;

    private String addedRemark2;

    private String addedRemark3;

    private String remark;

    private Long dividedNetPrice;

    private Long dividedLoanAmount;

    private Long dividedFirstPay;

    private Long dividedGlassInsurance;

    private Long dividedCusMortgage;

    private Long dividedSecuredMortgage;

    private String dividedCompanyName;

    private String dividedSecuredCompanyName;

    private Long insuranceCollectedAmount;

    private Long extendedWarrantyAmount;

    private Long purchaseTax;

    private Long licensePlateAmount;

    private Long discountAmount;

    private Long renewalDeposit;

    private Long jzAmount;

    private Long totalAmount;

    private String salesmanName;

    private String operatorName;

    private Date lastSubmitTime;

    private Boolean salesadminCheckFlag;

    private String salesadminCheckRemark;

    private String salesadminName;

    private Date salesadminCheckDate;

    private Boolean assignCarFlag;

    private String chassisNumber;

    private String engineNumber;

    private String assignCarMan;

    private Date assignCarDate;

    private Boolean takeBackCarFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPreorderNumber() {
        return preorderNumber;
    }

    public void setPreorderNumber(String preorderNumber) {
        this.preorderNumber = preorderNumber == null ? null : preorderNumber.trim();
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId == null ? null : cusId.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType == null ? null : identifyType.trim();
    }

    public String getIdentifyId() {
        return identifyId;
    }

    public void setIdentifyId(String identifyId) {
        this.identifyId = identifyId == null ? null : identifyId.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType == null ? null : cusType.trim();
    }

    public String getInvoiceCusName() {
        return invoiceCusName;
    }

    public void setInvoiceCusName(String invoiceCusName) {
        this.invoiceCusName = invoiceCusName == null ? null : invoiceCusName.trim();
    }

    public String getCarDemioName() {
        return carDemioName;
    }

    public void setCarDemioName(String carDemioName) {
        this.carDemioName = carDemioName == null ? null : carDemioName.trim();
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName == null ? null : carModelName.trim();
    }

    public String getConfigure() {
        return configure;
    }

    public void setConfigure(String configure) {
        this.configure = configure == null ? null : configure.trim();
    }

    public String getInColor() {
        return inColor;
    }

    public void setInColor(String inColor) {
        this.inColor = inColor == null ? null : inColor.trim();
    }

    public String getOutColor() {
        return outColor;
    }

    public void setOutColor(String outColor) {
        this.outColor = outColor == null ? null : outColor.trim();
    }

    public String getIntentionLevel() {
        return intentionLevel;
    }

    public void setIntentionLevel(String intentionLevel) {
        this.intentionLevel = intentionLevel == null ? null : intentionLevel.trim();
    }

    public Boolean getBuywayFirst() {
        return buywayFirst;
    }

    public void setBuywayFirst(Boolean buywayFirst) {
        this.buywayFirst = buywayFirst;
    }

    public Boolean getBuywayLoyal() {
        return buywayLoyal;
    }

    public void setBuywayLoyal(Boolean buywayLoyal) {
        this.buywayLoyal = buywayLoyal;
    }

    public Boolean getBuywayDisplace() {
        return buywayDisplace;
    }

    public void setBuywayDisplace(Boolean buywayDisplace) {
        this.buywayDisplace = buywayDisplace;
    }

    public Boolean getBuywayBigCus() {
        return buywayBigCus;
    }

    public void setBuywayBigCus(Boolean buywayBigCus) {
        this.buywayBigCus = buywayBigCus;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace == null ? null : originPlace.trim();
    }

    public Integer getBuyAccount() {
        return buyAccount;
    }

    public void setBuyAccount(Integer buyAccount) {
        this.buyAccount = buyAccount;
    }

    public String getLicensePlateProperty() {
        return licensePlateProperty;
    }

    public void setLicensePlateProperty(String licensePlateProperty) {
        this.licensePlateProperty = licensePlateProperty == null ? null : licensePlateProperty.trim();
    }

    public String getLicensePlateGetway() {
        return licensePlateGetway;
    }

    public void setLicensePlateGetway(String licensePlateGetway) {
        this.licensePlateGetway = licensePlateGetway == null ? null : licensePlateGetway.trim();
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Long getPrepaidAmount() {
        return prepaidAmount;
    }

    public void setPrepaidAmount(Long prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public Long getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(Long invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public Date getPayRestMoneyDay() {
        return payRestMoneyDay;
    }

    public void setPayRestMoneyDay(Date payRestMoneyDay) {
        this.payRestMoneyDay = payRestMoneyDay;
    }

    public Date getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public void setExpectedArrivalTime(Date expectedArrivalTime) {
        this.expectedArrivalTime = expectedArrivalTime;
    }

    public Date getGetCarDate() {
        return getCarDate;
    }

    public void setGetCarDate(Date getCarDate) {
        this.getCarDate = getCarDate;
    }

    public Boolean getAddedInsurance() {
        return addedInsurance;
    }

    public void setAddedInsurance(Boolean addedInsurance) {
        this.addedInsurance = addedInsurance;
    }

    public Boolean getAddedJz() {
        return addedJz;
    }

    public void setAddedJz(Boolean addedJz) {
        this.addedJz = addedJz;
    }

    public String getAddedRemark1() {
        return addedRemark1;
    }

    public void setAddedRemark1(String addedRemark1) {
        this.addedRemark1 = addedRemark1 == null ? null : addedRemark1.trim();
    }

    public String getAddedRemark2() {
        return addedRemark2;
    }

    public void setAddedRemark2(String addedRemark2) {
        this.addedRemark2 = addedRemark2 == null ? null : addedRemark2.trim();
    }

    public String getAddedRemark3() {
        return addedRemark3;
    }

    public void setAddedRemark3(String addedRemark3) {
        this.addedRemark3 = addedRemark3 == null ? null : addedRemark3.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getDividedNetPrice() {
        return dividedNetPrice;
    }

    public void setDividedNetPrice(Long dividedNetPrice) {
        this.dividedNetPrice = dividedNetPrice;
    }

    public Long getDividedLoanAmount() {
        return dividedLoanAmount;
    }

    public void setDividedLoanAmount(Long dividedLoanAmount) {
        this.dividedLoanAmount = dividedLoanAmount;
    }

    public Long getDividedFirstPay() {
        return dividedFirstPay;
    }

    public void setDividedFirstPay(Long dividedFirstPay) {
        this.dividedFirstPay = dividedFirstPay;
    }

    public Long getDividedGlassInsurance() {
        return dividedGlassInsurance;
    }

    public void setDividedGlassInsurance(Long dividedGlassInsurance) {
        this.dividedGlassInsurance = dividedGlassInsurance;
    }

    public Long getDividedCusMortgage() {
        return dividedCusMortgage;
    }

    public void setDividedCusMortgage(Long dividedCusMortgage) {
        this.dividedCusMortgage = dividedCusMortgage;
    }

    public Long getDividedSecuredMortgage() {
        return dividedSecuredMortgage;
    }

    public void setDividedSecuredMortgage(Long dividedSecuredMortgage) {
        this.dividedSecuredMortgage = dividedSecuredMortgage;
    }

    public String getDividedCompanyName() {
        return dividedCompanyName;
    }

    public void setDividedCompanyName(String dividedCompanyName) {
        this.dividedCompanyName = dividedCompanyName == null ? null : dividedCompanyName.trim();
    }

    public String getDividedSecuredCompanyName() {
        return dividedSecuredCompanyName;
    }

    public void setDividedSecuredCompanyName(String dividedSecuredCompanyName) {
        this.dividedSecuredCompanyName = dividedSecuredCompanyName == null ? null : dividedSecuredCompanyName.trim();
    }

    public Long getInsuranceCollectedAmount() {
        return insuranceCollectedAmount;
    }

    public void setInsuranceCollectedAmount(Long insuranceCollectedAmount) {
        this.insuranceCollectedAmount = insuranceCollectedAmount;
    }

    public Long getExtendedWarrantyAmount() {
        return extendedWarrantyAmount;
    }

    public void setExtendedWarrantyAmount(Long extendedWarrantyAmount) {
        this.extendedWarrantyAmount = extendedWarrantyAmount;
    }

    public Long getPurchaseTax() {
        return purchaseTax;
    }

    public void setPurchaseTax(Long purchaseTax) {
        this.purchaseTax = purchaseTax;
    }

    public Long getLicensePlateAmount() {
        return licensePlateAmount;
    }

    public void setLicensePlateAmount(Long licensePlateAmount) {
        this.licensePlateAmount = licensePlateAmount;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getRenewalDeposit() {
        return renewalDeposit;
    }

    public void setRenewalDeposit(Long renewalDeposit) {
        this.renewalDeposit = renewalDeposit;
    }

    public Long getJzAmount() {
        return jzAmount;
    }

    public void setJzAmount(Long jzAmount) {
        this.jzAmount = jzAmount;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName == null ? null : salesmanName.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public Date getLastSubmitTime() {
        return lastSubmitTime;
    }

    public void setLastSubmitTime(Date lastSubmitTime) {
        this.lastSubmitTime = lastSubmitTime;
    }

    public Boolean getSalesadminCheckFlag() {
        return salesadminCheckFlag;
    }

    public void setSalesadminCheckFlag(Boolean salesadminCheckFlag) {
        this.salesadminCheckFlag = salesadminCheckFlag;
    }

    public String getSalesadminCheckRemark() {
        return salesadminCheckRemark;
    }

    public void setSalesadminCheckRemark(String salesadminCheckRemark) {
        this.salesadminCheckRemark = salesadminCheckRemark == null ? null : salesadminCheckRemark.trim();
    }

    public String getSalesadminName() {
        return salesadminName;
    }

    public void setSalesadminName(String salesadminName) {
        this.salesadminName = salesadminName == null ? null : salesadminName.trim();
    }

    public Date getSalesadminCheckDate() {
        return salesadminCheckDate;
    }

    public void setSalesadminCheckDate(Date salesadminCheckDate) {
        this.salesadminCheckDate = salesadminCheckDate;
    }

    public Boolean getAssignCarFlag() {
        return assignCarFlag;
    }

    public void setAssignCarFlag(Boolean assignCarFlag) {
        this.assignCarFlag = assignCarFlag;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber == null ? null : chassisNumber.trim();
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber == null ? null : engineNumber.trim();
    }

    public String getAssignCarMan() {
        return assignCarMan;
    }

    public void setAssignCarMan(String assignCarMan) {
        this.assignCarMan = assignCarMan == null ? null : assignCarMan.trim();
    }

    public Date getAssignCarDate() {
        return assignCarDate;
    }

    public void setAssignCarDate(Date assignCarDate) {
        this.assignCarDate = assignCarDate;
    }

    public Boolean getTakeBackCarFlag() {
        return takeBackCarFlag;
    }

    public void setTakeBackCarFlag(Boolean takeBackCarFlag) {
        this.takeBackCarFlag = takeBackCarFlag;
    }
}