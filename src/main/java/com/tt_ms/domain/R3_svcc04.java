package com.tt_ms.domain;

import java.util.Date;

public class R3_svcc04 {
    private String ccxdm;

    private String ccxmc;

    private String ccp;

    private String cgsde;

    private Boolean ltybs;

    private Date dtyrq;

    private Integer id;

    private Boolean status;

    public String getCcxdm() {
        return ccxdm;
    }

    public void setCcxdm(String ccxdm) {
        this.ccxdm = ccxdm == null ? null : ccxdm.trim();
    }

    public String getCcxmc() {
        return ccxmc;
    }

    public void setCcxmc(String ccxmc) {
        this.ccxmc = ccxmc == null ? null : ccxmc.trim();
    }

    public String getCcp() {
        return ccp;
    }

    public void setCcp(String ccp) {
        this.ccp = ccp == null ? null : ccp.trim();
    }

    public String getCgsde() {
        return cgsde;
    }

    public void setCgsde(String cgsde) {
        this.cgsde = cgsde == null ? null : cgsde.trim();
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}