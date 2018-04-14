package com.tt_ms.domain;

import java.util.Date;

public class TT_preorder_template {
    private String serialNumber;

    private String cusName;

    private String salesMan;

    private String collectedWay;

    private Long collectedAmount;

    private String receiptNumber;

    private String remark;

    private String payMan;

    private Integer collectedType;

    private String bankInfo;

    private String cashierCode;

    private String cashierName;

    private Date collectedTime;

    private Integer preorderNumber;

    private Date matchTime;

    private String operator;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(String salesMan) {
        this.salesMan = salesMan == null ? null : salesMan.trim();
    }

    public String getCollectedWay() {
        return collectedWay;
    }

    public void setCollectedWay(String collectedWay) {
        this.collectedWay = collectedWay == null ? null : collectedWay.trim();
    }

    public Long getCollectedAmount() {
        return collectedAmount;
    }

    public void setCollectedAmount(Long collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber == null ? null : receiptNumber.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPayMan() {
        return payMan;
    }

    public void setPayMan(String payMan) {
        this.payMan = payMan == null ? null : payMan.trim();
    }

    public Integer getCollectedType() {
        return collectedType;
    }

    public void setCollectedType(Integer collectedType) {
        this.collectedType = collectedType;
    }

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo == null ? null : bankInfo.trim();
    }

    public String getCashierCode() {
        return cashierCode;
    }

    public void setCashierCode(String cashierCode) {
        this.cashierCode = cashierCode == null ? null : cashierCode.trim();
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName == null ? null : cashierName.trim();
    }

    public Date getCollectedTime() {
        return collectedTime;
    }

    public void setCollectedTime(Date collectedTime) {
        this.collectedTime = collectedTime;
    }

    public Integer getPreorderNumber() {
        return preorderNumber;
    }

    public void setPreorderNumber(Integer preorderNumber) {
        this.preorderNumber = preorderNumber;
    }

    public Date getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}