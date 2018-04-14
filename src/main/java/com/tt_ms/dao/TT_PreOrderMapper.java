package com.tt_ms.dao;

import com.tt_ms.domain.TT_PreOrder;

public interface TT_PreOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(TT_PreOrder record);

    int insertSelective(TT_PreOrder record);

    TT_PreOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TT_PreOrder record);

    int updateByPrimaryKey(TT_PreOrder record);
}