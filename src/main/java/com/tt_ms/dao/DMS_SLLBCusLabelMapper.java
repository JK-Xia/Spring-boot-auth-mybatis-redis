package com.tt_ms.dao;

import com.tt_ms.domain.DMS_SLLBCusLabel;

public interface DMS_SLLBCusLabelMapper {
    int deleteByPrimaryKey(Long pkey);

    int insert(DMS_SLLBCusLabel record);

    int insertSelective(DMS_SLLBCusLabel record);

    DMS_SLLBCusLabel selectByPrimaryKey(Long pkey);

    int updateByPrimaryKeySelective(DMS_SLLBCusLabel record);

    int updateByPrimaryKey(DMS_SLLBCusLabel record);
}