package com.tt_ms.dao;

import com.tt_ms.domain.User;
import org.springframework.stereotype.Component;

/**
 * Created by mm on 2018/4/9.
 */
@Component
public interface UserDao {
    User findUser(User user);
}
