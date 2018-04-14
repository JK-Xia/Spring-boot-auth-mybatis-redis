package com.tt_ms.dao;

import com.tt_ms.domain.TT1_permission;

public interface TT1_permissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(TT1_permission record);

    int insertSelective(TT1_permission record);

    TT1_permission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TT1_permission record);

    int updateByPrimaryKey(TT1_permission record);
}