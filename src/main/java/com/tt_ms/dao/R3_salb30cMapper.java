package com.tt_ms.dao;

import com.tt_ms.domain.R3_salb30c;

public interface R3_salb30cMapper {
    int deleteByPrimaryKey(String cxsdbh);

    int insert(R3_salb30c record);

    int insertSelective(R3_salb30c record);

    R3_salb30c selectByPrimaryKey(String cxsdbh);

    int updateByPrimaryKeySelective(R3_salb30c record);

    int updateByPrimaryKey(R3_salb30c record);
}