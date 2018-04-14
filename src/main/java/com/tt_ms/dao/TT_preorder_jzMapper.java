package com.tt_ms.dao;

import com.tt_ms.domain.TT_preorder_jz;
import com.tt_ms.domain.TT_preorder_jzKey;

public interface TT_preorder_jzMapper {
    int deleteByPrimaryKey(TT_preorder_jzKey key);

    int insert(TT_preorder_jz record);

    int insertSelective(TT_preorder_jz record);

    TT_preorder_jz selectByPrimaryKey(TT_preorder_jzKey key);

    int updateByPrimaryKeySelective(TT_preorder_jz record);

    int updateByPrimaryKey(TT_preorder_jz record);
}