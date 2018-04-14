package com.tt_ms.domain;

import java.util.Date;

public class TT_preorder_sk extends TT_preorder_skKey {
    private Date payDate;

    private String remark;

    private String settleMan;

    private String payWay;

    private String takeBackFlag;

    private Long collectedAmount;

    private String checkFlag;

    private Boolean status;

    private String payBillNumber;

    private String bankInfo;

    private String payMan;

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSettleMan() {
        return settleMan;
    }

    public void setSettleMan(String settleMan) {
        this.settleMan = settleMan == null ? null : settleMan.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getTakeBackFlag() {
        return takeBackFlag;
    }

    public void setTakeBackFlag(String takeBackFlag) {
        this.takeBackFlag = takeBackFlag == null ? null : takeBackFlag.trim();
    }

    public Long getCollectedAmount() {
        return collectedAmount;
    }

    public void setCollectedAmount(Long collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPayBillNumber() {
        return payBillNumber;
    }

    public void setPayBillNumber(String payBillNumber) {
        this.payBillNumber = payBillNumber == null ? null : payBillNumber.trim();
    }

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo == null ? null : bankInfo.trim();
    }

    public String getPayMan() {
        return payMan;
    }

    public void setPayMan(String payMan) {
        this.payMan = payMan == null ? null : payMan.trim();
    }
}