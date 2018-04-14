package com.tt_ms.dao;

import com.tt_ms.domain.R3_salb01d;
import com.tt_ms.domain.R3_salb01dKey;

public interface R3_salb01dMapper {
    int deleteByPrimaryKey(R3_salb01dKey key);

    int insert(R3_salb01d record);

    int insertSelective(R3_salb01d record);

    R3_salb01d selectByPrimaryKey(R3_salb01dKey key);

    int updateByPrimaryKeySelective(R3_salb01d record);

    int updateByPrimaryKey(R3_salb01d record);
}