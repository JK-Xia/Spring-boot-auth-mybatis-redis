package com.tt_ms.dao;

import com.tt_ms.domain.R3_salc01;

public interface R3_salc01Mapper {
    int deleteByPrimaryKey(String ccpdm);

    int insert(R3_salc01 record);

    int insertSelective(R3_salc01 record);

    R3_salc01 selectByPrimaryKey(String ccpdm);

    int updateByPrimaryKeySelective(R3_salc01 record);

    int updateByPrimaryKey(R3_salc01 record);
}