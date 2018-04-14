package com.tt_ms.dao;

import com.tt_ms.domain.R3_sysc10;

public interface R3_sysc10Mapper {
    int deleteByPrimaryKey(String cckdm);

    int insert(R3_sysc10 record);

    int insertSelective(R3_sysc10 record);

    R3_sysc10 selectByPrimaryKey(String cckdm);

    int updateByPrimaryKeySelective(R3_sysc10 record);

    int updateByPrimaryKey(R3_sysc10 record);
}