package com.tt_ms.service.impl;


import com.tt_ms.common.redis.IRedisService;
import com.tt_ms.common.JsonUtils;
import com.tt_ms.dao.UserDao;
import com.tt_ms.domain.User;
import com.tt_ms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * Created by mm on 2018/4/9.
 */

@Service
public class UserService implements IUserService{

    @Resource
    private UserDao userDao;

    @Autowired
    private IRedisService redisService;

    @Override
    public User findUser(User user){
        User catchUser =JsonUtils.toBean(redisService.get(user.getUserName()),User.class);
        if(StringUtils.isEmpty(catchUser)){
            User dbUser = userDao.findUser(user);
            if(!StringUtils.isEmpty(dbUser)){
                redisService.set(dbUser.getUserName(),JsonUtils.toJSONString(dbUser));
                return dbUser;
            }
            return null;
        }
        return catchUser;
    }
}
