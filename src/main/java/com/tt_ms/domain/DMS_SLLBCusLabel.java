package com.tt_ms.domain;

import java.util.Date;

public class DMS_SLLBCusLabel {
    private Long pkey;

    private String uid;

    private String vcode;

    private String vname;

    private String vdisplaynm;

    private String vdesc;

    private Integer ntype;

    private Integer nsort;

    private Boolean bstop;

    private String createby;

    private Date createon;

    private String updateby;

    private Long updateon;

    private String ndid;

    private String nbid;

    public Long getPkey() {
        return pkey;
    }

    public void setPkey(Long pkey) {
        this.pkey = pkey;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode == null ? null : vcode.trim();
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getVdisplaynm() {
        return vdisplaynm;
    }

    public void setVdisplaynm(String vdisplaynm) {
        this.vdisplaynm = vdisplaynm == null ? null : vdisplaynm.trim();
    }

    public String getVdesc() {
        return vdesc;
    }

    public void setVdesc(String vdesc) {
        this.vdesc = vdesc == null ? null : vdesc.trim();
    }

    public Integer getNtype() {
        return ntype;
    }

    public void setNtype(Integer ntype) {
        this.ntype = ntype;
    }

    public Integer getNsort() {
        return nsort;
    }

    public void setNsort(Integer nsort) {
        this.nsort = nsort;
    }

    public Boolean getBstop() {
        return bstop;
    }

    public void setBstop(Boolean bstop) {
        this.bstop = bstop;
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

    public String getNdid() {
        return ndid;
    }

    public void setNdid(String ndid) {
        this.ndid = ndid == null ? null : ndid.trim();
    }

    public String getNbid() {
        return nbid;
    }

    public void setNbid(String nbid) {
        this.nbid = nbid == null ? null : nbid.trim();
    }
}