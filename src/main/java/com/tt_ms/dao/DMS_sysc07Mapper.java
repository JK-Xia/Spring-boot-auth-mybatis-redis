package com.tt_ms.dao;

import com.tt_ms.domain.DMS_sysc07;

public interface DMS_sysc07Mapper {
    int deleteByPrimaryKey(Long pkey);

    int insert(DMS_sysc07 record);

    int insertSelective(DMS_sysc07 record);

    DMS_sysc07 selectByPrimaryKey(Long pkey);

    int updateByPrimaryKeySelective(DMS_sysc07 record);

    int updateByPrimaryKey(DMS_sysc07 record);
}