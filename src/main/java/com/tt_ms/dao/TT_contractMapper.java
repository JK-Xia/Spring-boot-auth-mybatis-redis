package com.tt_ms.dao;

import com.tt_ms.domain.TT_contract;

public interface TT_contractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TT_contract record);

    int insertSelective(TT_contract record);

    TT_contract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TT_contract record);

    int updateByPrimaryKey(TT_contract record);
}