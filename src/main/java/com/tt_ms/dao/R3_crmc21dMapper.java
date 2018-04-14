package com.tt_ms.dao;

import com.tt_ms.domain.R3_crmc21d;
import com.tt_ms.domain.R3_crmc21dKey;

public interface R3_crmc21dMapper {
    int deleteByPrimaryKey(R3_crmc21dKey key);

    int insert(R3_crmc21d record);

    int insertSelective(R3_crmc21d record);

    R3_crmc21d selectByPrimaryKey(R3_crmc21dKey key);

    int updateByPrimaryKeySelective(R3_crmc21d record);

    int updateByPrimaryKey(R3_crmc21d record);
}