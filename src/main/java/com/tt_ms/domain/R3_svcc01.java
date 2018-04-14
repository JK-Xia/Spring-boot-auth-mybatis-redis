package com.tt_ms.domain;

import java.util.Date;

public class R3_svcc01 {
    private String cysdm;

    private String cyssm;

    private Boolean ltybs;

    private Date dtyrq;

    public String getCysdm() {
        return cysdm;
    }

    public void setCysdm(String cysdm) {
        this.cysdm = cysdm == null ? null : cysdm.trim();
    }

    public String getCyssm() {
        return cyssm;
    }

    public void setCyssm(String cyssm) {
        this.cyssm = cyssm == null ? null : cyssm.trim();
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