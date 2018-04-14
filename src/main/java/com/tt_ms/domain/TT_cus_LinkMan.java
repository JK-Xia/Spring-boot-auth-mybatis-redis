package com.tt_ms.domain;

import java.util.Date;

public class TT_cus_LinkMan {
    private String customerId;

    private String name;

    private String sex;

    private String relationship;

    private Integer type;

    private String mobilephone;

    private String telephone;

    private String otherphones;

    private Boolean isMainLinkman;

    private Date convenientContactTime;

    private String convenientContactWay;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getOtherphones() {
        return otherphones;
    }

    public void setOtherphones(String otherphones) {
        this.otherphones = otherphones == null ? null : otherphones.trim();
    }

    public Boolean getIsMainLinkman() {
        return isMainLinkman;
    }

    public void setIsMainLinkman(Boolean isMainLinkman) {
        this.isMainLinkman = isMainLinkman;
    }

    public Date getConvenientContactTime() {
        return convenientContactTime;
    }

    public void setConvenientContactTime(Date convenientContactTime) {
        this.convenientContactTime = convenientContactTime;
    }

    public String getConvenientContactWay() {
        return convenientContactWay;
    }

    public void setConvenientContactWay(String convenientContactWay) {
        this.convenientContactWay = convenientContactWay == null ? null : convenientContactWay.trim();
    }
}