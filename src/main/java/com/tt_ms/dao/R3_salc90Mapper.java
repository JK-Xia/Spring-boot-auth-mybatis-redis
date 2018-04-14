package com.tt_ms.dao;

import com.tt_ms.domain.R3_salc90;

public interface R3_salc90Mapper {
    int deleteByPrimaryKey(String cfsdm);

    int insert(R3_salc90 record);

    int insertSelective(R3_salc90 record);

    R3_salc90 selectByPrimaryKey(String cfsdm);

    int updateByPrimaryKeySelective(R3_salc90 record);

    int updateByPrimaryKey(R3_salc90 record);
}