package com.tt_ms.domain;

import java.util.Date;

public class R3_sysc10 {
    private String cckdm;

    private String ccksm;

    private String ccksx;

    private String cckjjfa;

    private Boolean lpdbs;

    private Boolean ltybs;

    private Date dtyrq;

    public String getCckdm() {
        return cckdm;
    }

    public void setCckdm(String cckdm) {
        this.cckdm = cckdm == null ? null : cckdm.trim();
    }

    public String getCcksm() {
        return ccksm;
    }

    public void setCcksm(String ccksm) {
        this.ccksm = ccksm == null ? null : ccksm.trim();
    }

    public String getCcksx() {
        return ccksx;
    }

    public void setCcksx(String ccksx) {
        this.ccksx = ccksx == null ? null : ccksx.trim();
    }

    public String getCckjjfa() {
        return cckjjfa;
    }

    public void setCckjjfa(String cckjjfa) {
        this.cckjjfa = cckjjfa == null ? null : cckjjfa.trim();
    }

    public Boolean getLpdbs() {
        return lpdbs;
    }

    public void setLpdbs(Boolean lpdbs) {
        this.lpdbs = lpdbs;
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