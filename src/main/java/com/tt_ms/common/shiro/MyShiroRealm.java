package com.tt_ms.common.shiro;

import com.tt_ms.domain.User;
import com.tt_ms.service.IUserPermissonService;
import com.tt_ms.service.impl.UserPermissonService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by poker0325@me.com on 2018/4/10.
 */
@Component
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private IUserPermissonService userPermissonService;



    @Bean
    public UserPermissonService userPermissonService(){

        return  new UserPermissonService();
    }

    @Autowired
    private IUserPermissonService ermissonService(UserPermissonService userPermissonServiceService){
        return this.userPermissonService = userPermissonServiceService;
    }

    /**
     * 授权用户权限
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
        //获取用户角色
        Set<String> roleSet = new HashSet<String>();
        roleSet.add("admin");
        info.setRoles(roleSet);

        //获取用户权限

         Set<String> permissionSet =  userPermissonService.findUserPermisson(1);


        info.setStringPermissions(permissionSet);
        user.setUserPermisson(permissionSet);
        System.out.println(user);

        return info;
    }


    /**
     * 验证用户身份
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String username = token.getUsername();
        String password = String.valueOf(token.getPassword());

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("nickname", username);
        //密码进行加密处理  明文为  password+name
        String paw = password+username;
        String pawDES = MD5Encoder.encode(paw.getBytes());
        map.put("pswd", pawDES);

        User user = new User();
        user.setId(112222);
        user.setUserName(username);
        user.setPassword(pawDES);


        return new SimpleAuthenticationInfo(user, password, getName());
    }
}
