package com.tt_ms.dao;

import com.tt_ms.domain.DMS_sysc90d;

public interface DMS_sysc90dMapper {
    int deleteByPrimaryKey(Long pkey);

    int insert(DMS_sysc90d record);

    int insertSelective(DMS_sysc90d record);

    DMS_sysc90d selectByPrimaryKey(Long pkey);

    int updateByPrimaryKeySelective(DMS_sysc90d record);

    int updateByPrimaryKey(DMS_sysc90d record);
}