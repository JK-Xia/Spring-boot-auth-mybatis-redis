package com.tt_ms.domain;

import java.util.Date;

public class DMS_sysc90c {
    private Long pkey;

    private String id;

    private String ncusgroupid;

    private String vdict;

    private String vdictname;

    private Boolean cextand;

    private Boolean cvisible;

    private Integer nlen;

    private String vmodule;

    private String vcomment;

    private String createby;

    private Date createon;

    private String updateby;

    private Long updateon;

    public Long getPkey() {
        return pkey;
    }

    public void setPkey(Long pkey) {
        this.pkey = pkey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNcusgroupid() {
        return ncusgroupid;
    }

    public void setNcusgroupid(String ncusgroupid) {
        this.ncusgroupid = ncusgroupid == null ? null : ncusgroupid.trim();
    }

    public String getVdict() {
        return vdict;
    }

    public void setVdict(String vdict) {
        this.vdict = vdict == null ? null : vdict.trim();
    }

    public String getVdictname() {
        return vdictname;
    }

    public void setVdictname(String vdictname) {
        this.vdictname = vdictname == null ? null : vdictname.trim();
    }

    public Boolean getCextand() {
        return cextand;
    }

    public void setCextand(Boolean cextand) {
        this.cextand = cextand;
    }

    public Boolean getCvisible() {
        return cvisible;
    }

    public void setCvisible(Boolean cvisible) {
        this.cvisible = cvisible;
    }

    public Integer getNlen() {
        return nlen;
    }

    public void setNlen(Integer nlen) {
        this.nlen = nlen;
    }

    public String getVmodule() {
        return vmodule;
    }

    public void setVmodule(String vmodule) {
        this.vmodule = vmodule == null ? null : vmodule.trim();
    }

    public String getVcomment() {
        return vcomment;
    }

    public void setVcomment(String vcomment) {
        this.vcomment = vcomment == null ? null : vcomment.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreateon() {
        return createon;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Long getUpdateon() {
        return updateon;
    }

    public void setUpdateon(Long updateon) {
        this.updateon = updateon;
    }
}