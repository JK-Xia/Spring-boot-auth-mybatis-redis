package com.tt_ms.dao;

import com.tt_ms.domain.TT_preorder_template;

public interface TT_preorder_templateMapper {
    int deleteByPrimaryKey(String serialNumber);

    int insert(TT_preorder_template record);

    int insertSelective(TT_preorder_template record);

    TT_preorder_template selectByPrimaryKey(String serialNumber);

    int updateByPrimaryKeySelective(TT_preorder_template record);

    int updateByPrimaryKey(TT_preorder_template record);
}