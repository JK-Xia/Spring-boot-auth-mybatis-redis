package com.tt_ms.dao;

import com.tt_ms.domain.TT_cus_LinkMan;

public interface TT_cus_LinkManMapper {
    int deleteByPrimaryKey(String customerId);

    int insert(TT_cus_LinkMan record);

    int insertSelective(TT_cus_LinkMan record);

    TT_cus_LinkMan selectByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(TT_cus_LinkMan record);

    int updateByPrimaryKey(TT_cus_LinkMan record);
}