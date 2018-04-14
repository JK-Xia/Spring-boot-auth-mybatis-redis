package com.tt_ms.domain;

import java.util.Date;

public class R3_salb30d extends R3_salb30dKey {
    private String ccpdm;

    private String cfdjh;

    private String chgzh;

    private Long nxsdj;

    private Long nse;

    private Long ncbdj;

    private Byte ndysl;

    private String cfdlsh;

    private String csyjmm;

    private Date dscrq;

    public String getCcpdm() {
        return ccpdm;
    }

    public void setCcpdm(String ccpdm) {
        this.ccpdm = ccpdm == null ? null : ccpdm.trim();
    }

    public String getCfdjh() {
        return cfdjh;
    }

    public void setCfdjh(String cfdjh) {
        this.cfdjh = cfdjh == null ? null : cfdjh.trim();
    }

    public String getChgzh() {
        return chgzh;
    }

    public void setChgzh(String chgzh) {
        this.chgzh = chgzh == null ? null : chgzh.trim();
    }

    public Long getNxsdj() {
        return nxsdj;
    }

    public void setNxsdj(Long nxsdj) {
        this.nxsdj = nxsdj;
    }

    public Long getNse() {
        return nse;
    }

    public void setNse(Long nse) {
        this.nse = nse;
    }

    public Long getNcbdj() {
        return ncbdj;
    }

    public void setNcbdj(Long ncbdj) {
        this.ncbdj = ncbdj;
    }

    public Byte getNdysl() {
        return ndysl;
    }

    public void setNdysl(Byte ndysl) {
        this.ndysl = ndysl;
    }

    public String getCfdlsh() {
        return cfdlsh;
    }

    public void setCfdlsh(String cfdlsh) {
        this.cfdlsh = cfdlsh == null ? null : cfdlsh.trim();
    }

    public String getCsyjmm() {
        return csyjmm;
    }

    public void setCsyjmm(String csyjmm) {
        this.csyjmm = csyjmm == null ? null : csyjmm.trim();
    }

    public Date getDscrq() {
        return dscrq;
    }

    public void setDscrq(Date dscrq) {
        this.dscrq = dscrq;
    }
}