package com.tt_ms.dao;

import com.tt_ms.domain.R3_crmc21c;

public interface R3_crmc21cMapper {
    int deleteByPrimaryKey(String csqdm);

    int insert(R3_crmc21c record);

    int insertSelective(R3_crmc21c record);

    R3_crmc21c selectByPrimaryKey(String csqdm);

    int updateByPrimaryKeySelective(R3_crmc21c record);

    int updateByPrimaryKey(R3_crmc21c record);
}