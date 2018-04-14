package com.tt_ms.domain;

import java.util.Date;

public class DMS_sysc07 {
    private Long pkey;

    private String createby;

    private Date createon;

    private String updateby;

    private Long updateon;

    private String vcode;

    private String vname;

    private String vpinyin;

    private String vsort;

    private String nparentid;

    private String vdesc;

    private String vlevel;

    private String vprovince;

    private String vprovincename;

    private String vcity;

    private String vcityname;

    private String vcountry;

    private String vcountryname;

    private String vpostno;

    private Boolean cstop;

    private Date dstop;

    private String ncusgroupid;

    private String id;

    public Long getPkey() {
        return pkey;
    }

    public void setPkey(Long pkey) {
        this.pkey = pkey;
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

    public String getVpinyin() {
        return vpinyin;
    }

    public void setVpinyin(String vpinyin) {
        this.vpinyin = vpinyin == null ? null : vpinyin.trim();
    }

    public String getVsort() {
        return vsort;
    }

    public void setVsort(String vsort) {
        this.vsort = vsort == null ? null : vsort.trim();
    }

    public String getNparentid() {
        return nparentid;
    }

    public void setNparentid(String nparentid) {
        this.nparentid = nparentid == null ? null : nparentid.trim();
    }

    public String getVdesc() {
        return vdesc;
    }

    public void setVdesc(String vdesc) {
        this.vdesc = vdesc == null ? null : vdesc.trim();
    }

    public String getVlevel() {
        return vlevel;
    }

    public void setVlevel(String vlevel) {
        this.vlevel = vlevel == null ? null : vlevel.trim();
    }

    public String getVprovince() {
        return vprovince;
    }

    public void setVprovince(String vprovince) {
        this.vprovince = vprovince == null ? null : vprovince.trim();
    }

    public String getVprovincename() {
        return vprovincename;
    }

    public void setVprovincename(String vprovincename) {
        this.vprovincename = vprovincename == null ? null : vprovincename.trim();
    }

    public String getVcity() {
        return vcity;
    }

    public void setVcity(String vcity) {
        this.vcity = vcity == null ? null : vcity.trim();
    }

    public String getVcityname() {
        return vcityname;
    }

    public void setVcityname(String vcityname) {
        this.vcityname = vcityname == null ? null : vcityname.trim();
    }

    public String getVcountry() {
        return vcountry;
    }

    public void setVcountry(String vcountry) {
        this.vcountry = vcountry == null ? null : vcountry.trim();
    }

    public String getVcountryname() {
        return vcountryname;
    }

    public void setVcountryname(String vcountryname) {
        this.vcountryname = vcountryname == null ? null : vcountryname.trim();
    }

    public String getVpostno() {
        return vpostno;
    }

    public void setVpostno(String vpostno) {
        this.vpostno = vpostno == null ? null : vpostno.trim();
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

    public String getNcusgroupid() {
        return ncusgroupid;
    }

    public void setNcusgroupid(String ncusgroupid) {
        this.ncusgroupid = ncusgroupid == null ? null : ncusgroupid.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}