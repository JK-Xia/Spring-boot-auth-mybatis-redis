package com.tt_ms.domain;

import java.util.Date;

public class R3_crmc03 {
    private String ckhlb;

    private String ckhlbsm;

    private Boolean ltybs;

    private Date dtyrq;

    public String getCkhlb() {
        return ckhlb;
    }

    public void setCkhlb(String ckhlb) {
        this.ckhlb = ckhlb == null ? null : ckhlb.trim();
    }

    public String getCkhlbsm() {
        return ckhlbsm;
    }

    public void setCkhlbsm(String ckhlbsm) {
        this.ckhlbsm = ckhlbsm == null ? null : ckhlbsm.trim();
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