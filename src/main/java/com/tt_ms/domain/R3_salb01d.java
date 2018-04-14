package com.tt_ms.domain;

import java.util.Date;

public class R3_salb01d extends R3_salb01dKey {
    private String cckdm;

    private String ccpdm;

    private Long nfyje;

    private Date dlrrq;

    private String cczydm;

    private String cbz;

    public String getCckdm() {
        return cckdm;
    }

    public void setCckdm(String cckdm) {
        this.cckdm = cckdm == null ? null : cckdm.trim();
    }

    public String getCcpdm() {
        return ccpdm;
    }

    public void setCcpdm(String ccpdm) {
        this.ccpdm = ccpdm == null ? null : ccpdm.trim();
    }

    public Long getNfyje() {
        return nfyje;
    }

    public void setNfyje(Long nfyje) {
        this.nfyje = nfyje;
    }

    public Date getDlrrq() {
        return dlrrq;
    }

    public void setDlrrq(Date dlrrq) {
        this.dlrrq = dlrrq;
    }

    public String getCczydm() {
        return cczydm;
    }

    public void setCczydm(String cczydm) {
        this.cczydm = cczydm == null ? null : cczydm.trim();
    }

    public String getCbz() {
        return cbz;
    }

    public void setCbz(String cbz) {
        this.cbz = cbz == null ? null : cbz.trim();
    }
}