package com.tt_ms.dao;

import com.tt_ms.domain.R3_salc02;

public interface R3_salc02Mapper {
    int deleteByPrimaryKey(String czcfldm);

    int insert(R3_salc02 record);

    int insertSelective(R3_salc02 record);

    R3_salc02 selectByPrimaryKey(String czcfldm);

    int updateByPrimaryKeySelective(R3_salc02 record);

    int updateByPrimaryKey(R3_salc02 record);
}