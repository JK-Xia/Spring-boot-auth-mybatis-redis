package com.tt_ms.domain;

public class TT_jz_bill_item extends TT_jz_bill_itemKey {
    private String jzName;

    private Integer salesNumber;

    private String unit;

    private Long costPrice;

    private Long taxBuyPrice;

    private Long outInventoryPrice;

    private Long accountingPrice;

    private Long amountReceivable;

    private Long amountCollected;

    public String getJzName() {
        return jzName;
    }

    public void setJzName(String jzName) {
        this.jzName = jzName == null ? null : jzName.trim();
    }

    public Integer getSalesNumber() {
        return salesNumber;
    }

    public void setSalesNumber(Integer salesNumber) {
        this.salesNumber = salesNumber;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getTaxBuyPrice() {
        return taxBuyPrice;
    }

    public void setTaxBuyPrice(Long taxBuyPrice) {
        this.taxBuyPrice = taxBuyPrice;
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
}