package com.tt_ms.dao;

import com.tt_ms.domain.TT_jz_bill_item;
import com.tt_ms.domain.TT_jz_bill_itemKey;

public interface TT_jz_bill_itemMapper {
    int deleteByPrimaryKey(TT_jz_bill_itemKey key);

    int insert(TT_jz_bill_item record);

    int insertSelective(TT_jz_bill_item record);

    TT_jz_bill_item selectByPrimaryKey(TT_jz_bill_itemKey key);

    int updateByPrimaryKeySelective(TT_jz_bill_item record);

    int updateByPrimaryKey(TT_jz_bill_item record);
}