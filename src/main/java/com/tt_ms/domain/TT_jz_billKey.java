package com.tt_ms.domain;

public class TT_jz_billKey {
    private String billNunber;

    private String chassisNumber;

    public String getBillNunber() {
        return billNunber;
    }

    public void setBillNunber(String billNunber) {
        this.billNunber = billNunber == null ? null : billNunber.trim();
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber == null ? null : chassisNumber.trim();
    }
}