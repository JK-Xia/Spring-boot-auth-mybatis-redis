package com.tt_ms.dao;

import com.tt_ms.domain.R3_spab02c;

public interface R3_spab02cMapper {
    int deleteByPrimaryKey(String crckdbh);

    int insert(R3_spab02c record);

    int insertSelective(R3_spab02c record);

    R3_spab02c selectByPrimaryKey(String crckdbh);

    int updateByPrimaryKeySelective(R3_spab02c record);

    int updateByPrimaryKey(R3_spab02c record);
}