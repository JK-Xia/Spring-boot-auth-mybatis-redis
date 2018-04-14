package com.tt_ms.domain;

import java.util.Date;

public class R3_crmc05 {
    private String ckhjb;

    private String ckhjbms;

    private Integer ngsyhl;

    private Integer nclyhl;

    private Boolean ltybs;

    private Date dtyrq;

    public String getCkhjb() {
        return ckhjb;
    }

    public void setCkhjb(String ckhjb) {
        this.ckhjb = ckhjb == null ? null : ckhjb.trim();
    }

    public String getCkhjbms() {
        return ckhjbms;
    }

    public void setCkhjbms(String ckhjbms) {
        this.ckhjbms = ckhjbms == null ? null : ckhjbms.trim();
    }

    public Integer getNgsyhl() {
        return ngsyhl;
    }

    public void setNgsyhl(Integer ngsyhl) {
        this.ngsyhl = ngsyhl;
    }

    public Integer getNclyhl() {
        return nclyhl;
    }

    public void setNclyhl(Integer nclyhl) {
        this.nclyhl = nclyhl;
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