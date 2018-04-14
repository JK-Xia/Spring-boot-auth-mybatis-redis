package com.tt_ms.dao;

import com.tt_ms.domain.TT1_company;

public interface TT1_companyMapper {
    int deleteByPrimaryKey(String id);

    int insert(TT1_company record);

    int insertSelective(TT1_company record);

    TT1_company selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TT1_company record);

    int updateByPrimaryKey(TT1_company record);
}