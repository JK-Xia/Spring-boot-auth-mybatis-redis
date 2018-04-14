package com.tt_ms.dao;

import com.tt_ms.domain.TT_preorder_sk;
import com.tt_ms.domain.TT_preorder_skKey;

public interface TT_preorder_skMapper {
    int deleteByPrimaryKey(TT_preorder_skKey key);

    int insert(TT_preorder_sk record);

    int insertSelective(TT_preorder_sk record);

    TT_preorder_sk selectByPrimaryKey(TT_preorder_skKey key);

    int updateByPrimaryKeySelective(TT_preorder_sk record);

    int updateByPrimaryKey(TT_preorder_sk record);
}