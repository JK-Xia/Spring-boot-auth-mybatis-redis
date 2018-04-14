package com.tt_ms.dao;

import com.tt_ms.domain.TT1_user;

public interface TT1_userMapper {
    int deleteByPrimaryKey(String userId);

    int insert(TT1_user record);

    int insertSelective(TT1_user record);

    TT1_user selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(TT1_user record);

    int updateByPrimaryKey(TT1_user record);
}