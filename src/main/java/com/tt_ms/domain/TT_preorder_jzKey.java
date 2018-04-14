package com.tt_ms.domain;

public class TT_preorder_jzKey {
    private String preorderNumber;

    private String jzCode;

    public String getPreorderNumber() {
        return preorderNumber;
    }

    public void setPreorderNumber(String preorderNumber) {
        this.preorderNumber = preorderNumber == null ? null : preorderNumber.trim();
    }

    public String getJzCode() {
        return jzCode;
    }

    public void setJzCode(String jzCode) {
        this.jzCode = jzCode == null ? null : jzCode.trim();
    }
}