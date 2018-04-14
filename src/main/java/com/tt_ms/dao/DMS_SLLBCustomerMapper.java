package com.tt_ms.dao;

import com.tt_ms.domain.DMS_SLLBCustomer;

public interface DMS_SLLBCustomerMapper {
    int deleteByPrimaryKey(Long pkey);

    int insert(DMS_SLLBCustomer record);

    int insertSelective(DMS_SLLBCustomer record);

    DMS_SLLBCustomer selectByPrimaryKey(Long pkey);

    int updateByPrimaryKeySelective(DMS_SLLBCustomer record);

    int updateByPrimaryKey(DMS_SLLBCustomer record);
}