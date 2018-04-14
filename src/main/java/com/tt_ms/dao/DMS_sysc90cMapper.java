package com.tt_ms.dao;

import com.tt_ms.domain.DMS_sysc90c;

public interface DMS_sysc90cMapper {
    int deleteByPrimaryKey(Long pkey);

    int insert(DMS_sysc90c record);

    int insertSelective(DMS_sysc90c record);

    DMS_sysc90c selectByPrimaryKey(Long pkey);

    int updateByPrimaryKeySelective(DMS_sysc90c record);

    int updateByPrimaryKey(DMS_sysc90c record);
}