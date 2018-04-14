package com.tt_ms.dao;

import com.tt_ms.domain.R3_salb02d;
import com.tt_ms.domain.R3_salb02dKey;

public interface R3_salb02dMapper {
    int deleteByPrimaryKey(R3_salb02dKey key);

    int insert(R3_salb02d record);

    int insertSelective(R3_salb02d record);

    R3_salb02d selectByPrimaryKey(R3_salb02dKey key);

    int updateByPrimaryKeySelective(R3_salb02d record);

    int updateByPrimaryKey(R3_salb02d record);
}