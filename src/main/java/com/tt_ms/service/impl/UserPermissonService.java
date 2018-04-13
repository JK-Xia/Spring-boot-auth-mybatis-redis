package com.tt_ms.service.impl;

import com.tt_ms.common.redis.IRedisService;
import com.tt_ms.dao.PermissonDao;
import com.tt_ms.service.IUserPermissonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mm on 2018/4/11.
 */
@Service
public class UserPermissonService implements IUserPermissonService {


    @Resource
    private PermissonDao permissonDao;

    @Autowired
    private IRedisService redisService;
    
    @Override
    public Set<String> findUserPermisson(int userId) {

        Set<String> premisson = new HashSet<>();
        premisson.add("a");
        premisson.add("a");
        premisson.add("b");
        premisson.add("b");
        premisson.add("c");
        premisson.add("c");
        return premisson;
    }

    @Override
    public int addPermisson(String permisson) {
        return 0;
    }

    @Override
    public int removePermisson(String userID) {
        return 0;
    }

    @Override
    public int upDatePermisson(String userId) {
        return 0;
    }
}
