package com.tt_ms.dao;

import com.tt_ms.domain.R3_crmc05;

public interface R3_crmc05Mapper {
    int deleteByPrimaryKey(String ckhjb);

    int insert(R3_crmc05 record);

    int insertSelective(R3_crmc05 record);

    R3_crmc05 selectByPrimaryKey(String ckhjb);

    int updateByPrimaryKeySelective(R3_crmc05 record);

    int updateByPrimaryKey(R3_crmc05 record);
}