package com.tt_ms.domain;

public class TT_preorder_skKey {
    private String preorderNumber;

    private Integer id;

    public String getPreorderNumber() {
        return preorderNumber;
    }

    public void setPreorderNumber(String preorderNumber) {
        this.preorderNumber = preorderNumber == null ? null : preorderNumber.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}