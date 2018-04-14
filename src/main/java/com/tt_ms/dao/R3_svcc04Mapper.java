package com.tt_ms.dao;

import com.tt_ms.domain.R3_svcc04;

public interface R3_svcc04Mapper {
    int deleteByPrimaryKey(String ccxdm);

    int insert(R3_svcc04 record);

    int insertSelective(R3_svcc04 record);

    R3_svcc04 selectByPrimaryKey(String ccxdm);

    int updateByPrimaryKeySelective(R3_svcc04 record);

    int updateByPrimaryKey(R3_svcc04 record);
}