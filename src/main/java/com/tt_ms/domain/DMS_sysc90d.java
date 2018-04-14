package com.tt_ms.domain;

import java.util.Date;

public class DMS_sysc90d {
    private Long pkey;

    private String id;

    private String vdict;

    private String vdictchild;

    private String vdictchildname;

    private String vextand;

    private String vextand1;

    private Integer nsort;

    private Boolean cstop;

    private Date dstop;

    private String ndid;

    private String vremark;

    private Boolean cdefault;

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

    public String getVdict() {
        return vdict;
    }

    public void setVdict(String vdict) {
        this.vdict = vdict == null ? null : vdict.trim();
    }

    public String getVdictchild() {
        return vdictchild;
    }

    public void setVdictchild(String vdictchild) {
        this.vdictchild = vdictchild == null ? null : vdictchild.trim();
    }

    public String getVdictchildname() {
        return vdictchildname;
    }

    public void setVdictchildname(String vdictchildname) {
        this.vdictchildname = vdictchildname == null ? null : vdictchildname.trim();
    }

    public String getVextand() {
        return vextand;
    }

    public void setVextand(String vextand) {
        this.vextand = vextand == null ? null : vextand.trim();
    }

    public String getVextand1() {
        return vextand1;
    }

    public void setVextand1(String vextand1) {
        this.vextand1 = vextand1 == null ? null : vextand1.trim();
    }

    public Integer getNsort() {
        return nsort;
    }

    public void setNsort(Integer nsort) {
        this.nsort = nsort;
    }

    public Boolean getCstop() {
        return cstop;
    }

    public void setCstop(Boolean cstop) {
        this.cstop = cstop;
    }

    public Date getDstop() {
        return dstop;
    }

    public void setDstop(Date dstop) {
        this.dstop = dstop;
    }

    public String getNdid() {
        return ndid;
    }

    public void setNdid(String ndid) {
        this.ndid = ndid == null ? null : ndid.trim();
    }

    public String getVremark() {
        return vremark;
    }

    public void setVremark(String vremark) {
        this.vremark = vremark == null ? null : vremark.trim();
    }

    public Boolean getCdefault() {
        return cdefault;
    }

    public void setCdefault(Boolean cdefault) {
        this.cdefault = cdefault;
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