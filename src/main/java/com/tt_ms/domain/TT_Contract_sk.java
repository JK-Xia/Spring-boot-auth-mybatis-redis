package com.tt_ms.domain;

import java.util.Date;

public class TT_Contract_sk {
    private Integer id;

    private String contractId;

    private String cusName;

    private Date createDate;

    private String payBillId;

    private String remark;

    private String settleMan;

    private String payWay;

    private String takeBackFlag;

    private String payMan;

    private Long collectedAmount;

    private String invoiceFlag;

    private Boolean status;

    private String bankInfo;

    private String financeRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getPayBillId() {
        return payBillId;
    }

    public void setPayBillId(String payBillId) {
        this.payBillId = payBillId == null ? null : payBillId.trim();
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

    public String getPayMan() {
        return payMan;
    }

    public void setPayMan(String payMan) {
        this.payMan = payMan == null ? null : payMan.trim();
    }

    public Long getCollectedAmount() {
        return collectedAmount;
    }

    public void setCollectedAmount(Long collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public String getInvoiceFlag() {
        return invoiceFlag;
    }

    public void setInvoiceFlag(String invoiceFlag) {
        this.invoiceFlag = invoiceFlag == null ? null : invoiceFlag.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo == null ? null : bankInfo.trim();
    }

    public String getFinanceRemark() {
        return financeRemark;
    }

    public void setFinanceRemark(String financeRemark) {
        this.financeRemark = financeRemark == null ? null : financeRemark.trim();
    }
}