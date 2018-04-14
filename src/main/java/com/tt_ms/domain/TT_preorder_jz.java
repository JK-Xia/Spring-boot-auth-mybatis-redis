package com.tt_ms.domain;

public class TT_preorder_jz extends TT_preorder_jzKey {
    private String jzName;

    private Long costPrice;

    private Long outInventoryPrice;

    private Long accountingPrice;

    private Long amountReceivable;

    private Long amountCollected;

    private Integer number;

    public String getJzName() {
        return jzName;
    }

    public void setJzName(String jzName) {
        this.jzName = jzName == null ? null : jzName.trim();
    }

    public Long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getOutInventoryPrice() {
        return outInventoryPrice;
    }

    public void setOutInventoryPrice(Long outInventoryPrice) {
        this.outInventoryPrice = outInventoryPrice;
    }

    public Long getAccountingPrice() {
        return accountingPrice;
    }

    public void setAccountingPrice(Long accountingPrice) {
        this.accountingPrice = accountingPrice;
    }

    public Long getAmountReceivable() {
        return amountReceivable;
    }

    public void setAmountReceivable(Long amountReceivable) {
        this.amountReceivable = amountReceivable;
    }

    public Long getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(Long amountCollected) {
        this.amountCollected = amountCollected;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}