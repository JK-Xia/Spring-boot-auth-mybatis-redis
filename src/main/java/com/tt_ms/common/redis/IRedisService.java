package com.tt_ms.common.redis;

import java.util.List;

/**
 * Created by mm on 2018/4/9.
 */
public interface IRedisService {

    boolean set(String key, String value);

    String get(String key);

    boolean expire(String key, long expire);

    <T> boolean setList(String key, List<T> list);

    <T> List<T> getList(String key, Class<T> clz);

    long lpush(String key, Object obj);

    long rpush(String key, Object obj);

    String lpop(String key);

}
