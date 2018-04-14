package com.tt_ms.dao;

import com.tt_ms.domain.TT_Contract_sk;

public interface TT_Contract_skMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TT_Contract_sk record);

    int insertSelective(TT_Contract_sk record);

    TT_Contract_sk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TT_Contract_sk record);

    int updateByPrimaryKey(TT_Contract_sk record);
}