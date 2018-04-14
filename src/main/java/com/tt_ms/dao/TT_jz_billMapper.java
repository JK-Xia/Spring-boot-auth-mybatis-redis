package com.tt_ms.dao;

import com.tt_ms.domain.TT_jz_bill;
import com.tt_ms.domain.TT_jz_billKey;

public interface TT_jz_billMapper {
    int deleteByPrimaryKey(TT_jz_billKey key);

    int insert(TT_jz_bill record);

    int insertSelective(TT_jz_bill record);

    TT_jz_bill selectByPrimaryKey(TT_jz_billKey key);

    int updateByPrimaryKeySelective(TT_jz_bill record);

    int updateByPrimaryKey(TT_jz_bill record);
}