package com.tt_ms.domain;

import java.util.Date;

public class R3_salc02 {
    private String czcfldm;

    private String czcflsm;

    private Boolean ltybs;

    private Date dtyrq;

    public String getCzcfldm() {
        return czcfldm;
    }

    public void setCzcfldm(String czcfldm) {
        this.czcfldm = czcfldm == null ? null : czcfldm.trim();
    }

    public String getCzcflsm() {
        return czcflsm;
    }

    public void setCzcflsm(String czcflsm) {
        this.czcflsm = czcflsm == null ? null : czcflsm.trim();
    }

    public Boolean getLtybs() {
        return ltybs;
    }

    public void setLtybs(Boolean ltybs) {
        this.ltybs = ltybs;
    }

    public Date getDtyrq() {
        return dtyrq;
    }

    public void setDtyrq(Date dtyrq) {
        this.dtyrq = dtyrq;
    }
}