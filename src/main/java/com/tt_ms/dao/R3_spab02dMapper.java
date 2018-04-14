package com.tt_ms.dao;

import com.tt_ms.domain.R3_spab02d;
import com.tt_ms.domain.R3_spab02dKey;

public interface R3_spab02dMapper {
    int deleteByPrimaryKey(R3_spab02dKey key);

    int insert(R3_spab02d record);

    int insertSelective(R3_spab02d record);

    R3_spab02d selectByPrimaryKey(R3_spab02dKey key);

    int updateByPrimaryKeySelective(R3_spab02d record);

    int updateByPrimaryKey(R3_spab02d record);
}