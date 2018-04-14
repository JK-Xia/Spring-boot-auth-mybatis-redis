package com.tt_ms.domain;

import java.util.Date;

public class TT_jz_bill extends TT_jz_billKey {
    private String engineNumber;

    private String demioName;

    private String modelName;

    private String config;

    private String cusCode;

    private String cusName;

    private String cusType;

    private String identifyType;

    private String identifyId;

    private String mobilephone;

    private String operator;

    private Date creatDate;

    private Date expectDate;

    private String salesmanId;

    private String salesmanName;

    private Long usedJzAmount;

    private String remark;

    private String jzType;

    private Boolean isPromotion;

    private String payWay;

    private String invoiceNumber;

    private Integer invoiceAmount;

    private Integer amountReceivable;

    private Integer amountCollected;

    private Boolean settleFlag;

    private String settleWay;

    private String settleMan;

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber == null ? null : engineNumber.trim();
    }

    public String getDemioName() {
        return demioName;
    }

    public void setDemioName(String demioName) {
        this.demioName = demioName == null ? null : demioName.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode == null ? null : cusCode.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType == null ? null : cusType.trim();
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public Date getExpectDate() {
        return expectDate;
    }

    public void setExpectDate(Date expectDate) {
        this.expectDate = expectDate;
    }

    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId == null ? null : salesmanId.trim();
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName == null ? null : salesmanName.trim();
    }

    public Long getUsedJzAmount() {
        return usedJzAmount;
    }

    public void setUsedJzAmount(Long usedJzAmount) {
        this.usedJzAmount = usedJzAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getJzType() {
        return jzType;
    }

    public void setJzType(String jzType) {
        this.jzType = jzType == null ? null : jzType.trim();
    }

    public Boolean getIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(Boolean isPromotion) {
        this.isPromotion = isPromotion;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber == null ? null : invoiceNumber.trim();
    }

    public Integer getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Integer invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Integer getAmountReceivable() {
        return amountReceivable;
    }

    public void setAmountReceivable(Integer amountReceivable) {
        this.amountReceivable = amountReceivable;
    }

    public Integer getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(Integer amountCollected) {
        this.amountCollected = amountCollected;
    }

    public Boolean getSettleFlag() {
        return settleFlag;
    }

    public void setSettleFlag(Boolean settleFlag) {
        this.settleFlag = settleFlag;
    }

    public String getSettleWay() {
        return settleWay;
    }

    public void setSettleWay(String settleWay) {
        this.settleWay = settleWay == null ? null : settleWay.trim();
    }

    public String getSettleMan() {
        return settleMan;
    }

    public void setSettleMan(String settleMan) {
        this.settleMan = settleMan == null ? null : settleMan.trim();
    }
}