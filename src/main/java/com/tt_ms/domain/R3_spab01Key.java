package com.tt_ms.domain;

public class R3_spab01Key {
    private String cckdm;

    private String cbjdm;

    private String cph;

    public String getCckdm() {
        return cckdm;
    }

    public void setCckdm(String cckdm) {
        this.cckdm = cckdm == null ? null : cckdm.trim();
    }

    public String getCbjdm() {
        return cbjdm;
    }

    public void setCbjdm(String cbjdm) {
        this.cbjdm = cbjdm == null ? null : cbjdm.trim();
    }

    public String getCph() {
        return cph;
    }

    public void setCph(String cph) {
        this.cph = cph == null ? null : cph.trim();
    }
}