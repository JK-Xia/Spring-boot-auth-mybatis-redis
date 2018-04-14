package com.tt_ms.dao;

import com.tt_ms.domain.R3_salb30d;
import com.tt_ms.domain.R3_salb30dKey;

public interface R3_salb30dMapper {
    int deleteByPrimaryKey(R3_salb30dKey key);

    int insert(R3_salb30d record);

    int insertSelective(R3_salb30d record);

    R3_salb30d selectByPrimaryKey(R3_salb30dKey key);

    int updateByPrimaryKeySelective(R3_salb30d record);

    int updateByPrimaryKey(R3_salb30d record);
}