package com.tt_ms.dao;

import com.tt_ms.domain.R3_crmc03;

public interface R3_crmc03Mapper {
    int deleteByPrimaryKey(String ckhlb);

    int insert(R3_crmc03 record);

    int insertSelective(R3_crmc03 record);

    R3_crmc03 selectByPrimaryKey(String ckhlb);

    int updateByPrimaryKeySelective(R3_crmc03 record);

    int updateByPrimaryKey(R3_crmc03 record);
}