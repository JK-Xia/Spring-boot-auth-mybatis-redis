package com.tt_ms.dao;

import com.tt_ms.domain.R3_spab01;
import com.tt_ms.domain.R3_spab01Key;

public interface R3_spab01Mapper {
    int deleteByPrimaryKey(R3_spab01Key key);

    int insert(R3_spab01 record);

    int insertSelective(R3_spab01 record);

    R3_spab01 selectByPrimaryKey(R3_spab01Key key);

    int updateByPrimaryKeySelective(R3_spab01 record);

    int updateByPrimaryKey(R3_spab01 record);
}