package com.tt_ms.domain;

import java.util.Date;

public class R3_salc03 {
    private String chtxmdm;

    private String chtxmsm;

    private String chtxmkm;

    private Boolean ltybs;

    private Date dtyrq;

    public String getChtxmdm() {
        return chtxmdm;
    }

    public void setChtxmdm(String chtxmdm) {
        this.chtxmdm = chtxmdm == null ? null : chtxmdm.trim();
    }

    public String getChtxmsm() {
        return chtxmsm;
    }

    public void setChtxmsm(String chtxmsm) {
        this.chtxmsm = chtxmsm == null ? null : chtxmsm.trim();
    }

    public String getChtxmkm() {
        return chtxmkm;
    }

    public void setChtxmkm(String chtxmkm) {
        this.chtxmkm = chtxmkm == null ? null : chtxmkm.trim();
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