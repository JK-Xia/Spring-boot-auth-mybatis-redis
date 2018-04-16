
package com.tt_ms.service;

import com.tt_ms.domain.TT1_user;

/**
 * Created by mm on 2018/4/9.
 */
public interface IUserService {
    TT1_user findUser(TT1_user user);
    void setToken(String token,TT1_user user);
    String getToken(String token);

}
