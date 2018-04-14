package com.tt_ms.domain;

public class TT_jz_bill_itemKey {
    private String billNumber;

    private String jzNumber;

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber == null ? null : billNumber.trim();
    }

    public String getJzNumber() {
        return jzNumber;
    }

    public void setJzNumber(String jzNumber) {
        this.jzNumber = jzNumber == null ? null : jzNumber.trim();
    }
}