package com.tt_ms.service;

import java.util.Set;

/**
 * Created by mm on 2018/4/11.
 */
public interface IUserPermissonService {

    Set<String> findUserPermisson(int userId);

    int addPermisson(String permisson);

    int removePermisson(String userID);

    int upDatePermisson(String userId);

}
