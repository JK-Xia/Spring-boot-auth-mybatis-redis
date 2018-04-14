package com.tt_ms.dao;

import com.tt_ms.domain.R3_salc03;

public interface R3_salc03Mapper {
    int deleteByPrimaryKey(String chtxmdm);

    int insert(R3_salc03 record);

    int insertSelective(R3_salc03 record);

    R3_salc03 selectByPrimaryKey(String chtxmdm);

    int updateByPrimaryKeySelective(R3_salc03 record);

    int updateByPrimaryKey(R3_salc03 record);
}