package com.tt_ms.service.impl;


import com.tt_ms.common.JsonUtils;
import com.tt_ms.common.redis.IRedisService;
import com.tt_ms.dao.TT1_userMapper;
import com.tt_ms.domain.TT1_user;
import com.tt_ms.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * Created by mm on 2018/4/9.
 */
@Slf4j
@Service
public class UserService implements IUserService {

    @Resource
    private TT1_userMapper userMapper;

    @Autowired
    private IRedisService redisService;

    public void setToken(String token, TT1_user user) {
        redisService.set(token, user.toString());
        redisService.expire(token, 10);
    }

    public String getToken(String token) {
        return redisService.get(token);
    }

    @Override
    public TT1_user findUser(TT1_user user) {
        TT1_user catchUser = JsonUtils.toBean(redisService.get(user.getName()), TT1_user.class);
        try {
            if (StringUtils.isEmpty(catchUser)) {
                TT1_user dbUser = userMapper.selectByPrimaryKey(String.valueOf(user.getUserId()));
                if (!StringUtils.isEmpty(dbUser)) {
                    redisService.set(dbUser.getName(), JsonUtils.toJSONString(dbUser));
                    return dbUser;
                }
                return null;
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return catchUser;
    }

}