package com.tt_ms.dao;

import com.tt_ms.domain.R3_salb02c;

public interface R3_salb02cMapper {
    int deleteByPrimaryKey(String crckdbh);

    int insert(R3_salb02c record);

    int insertSelective(R3_salb02c record);

    R3_salb02c selectByPrimaryKey(String crckdbh);

    int updateByPrimaryKeySelective(R3_salb02c record);

    int updateByPrimaryKey(R3_salb02c record);
}