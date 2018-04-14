<<<<<<< HEAD
package com.tt_ms.service;

import com.tt_ms.domain.User;

/**
 * Created by mm on 2018/4/9.
 */
public interface IUserService {
    User findUser(User user);
    void setToken(String token,User user);
    String getToken(String token);

}
=======
package com.tt_ms.service;

import com.tt_ms.domain.User;

/**
 * Created by mm on 2018/4/9.
 */
public interface IUserService {
    User findUser(User user);
}
>>>>>>> 7bf5eb6c27f9d9393d6a32861b53d17e6215c8f3
