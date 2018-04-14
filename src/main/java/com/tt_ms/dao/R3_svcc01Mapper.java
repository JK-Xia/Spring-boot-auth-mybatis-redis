package com.tt_ms.dao;

import com.tt_ms.domain.R3_svcc01;

public interface R3_svcc01Mapper {
    int deleteByPrimaryKey(String cysdm);

    int insert(R3_svcc01 record);

    int insertSelective(R3_svcc01 record);

    R3_svcc01 selectByPrimaryKey(String cysdm);

    int updateByPrimaryKeySelective(R3_svcc01 record);

    int updateByPrimaryKey(R3_svcc01 record);
}