
package com.tt_ms.controller;

import com.tt_ms.domain.TT1_user;
import com.tt_ms.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;


/**
 * Created by poker0325@me.com on 2018/4/9.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;


    @RequestMapping(value="/login",method= RequestMethod.POST)

    public String login(String username, String password,String vcode,Boolean rememberMe,String userId,HttpServletRequest request){
        log.info("当前客户端：" + getClientIp(request) +" 的用户 ： " + username+ " 在服务 ：" +getServerIp() + "尝试登录系统..." );
        TT1_user dbuser;
        try{
          /*  UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
            SecurityUtils.getSubject().login(token);*/
            TT1_user user = new TT1_user();
            user.setUserId(userId);
            user.setName(username);
            user.setPassword(password);
            dbuser =userService.findUser(user);
            String token = UUID.randomUUID().toString();
            userService.setToken(token,dbuser);
            request.getSession().setAttribute("isLogin",true);
            request.getSession().setAttribute("token",token);

        }catch (Exception e){
            log.error("当前客户端：" + getClientIp(request) +" 的用户 ： " +username+ " 在 ：时间段" + "登录系统失败！" );
        }
        log.info("当前客户端：" + getClientIp(request) +" 的用户 ： " + username+ " 在服务 ：" +getServerIp() + "登录系统成功!" );
        return "loginSuccess";
    }


    @RequestMapping(value="/addUser",method= RequestMethod.POST)
    public String addUser(String username, String password,String vcode,Boolean rememberMe){
        return "addUser";
    }

    @RequestMapping(value="/updateUser",method= RequestMethod.POST)
    public String updateUser(String username, String password,String vcode,Boolean rememberMe){
        return "updateUser";
    }

    @RequestMapping(value="/findUser",method= RequestMethod.GET)
    public String findUser(String username, HttpServletRequest request){
        log.info("当前客户端：" + getClientIp(request) +" 的用户 ： " + username+ " 在 ：时间段 在 ：" +getServerIp() + "登录系统..." );
        return "findUser";
    }

    @RequestMapping(value="/updatePass",method= RequestMethod.POST)
    public String updatePass(String username, String password,String vcode,Boolean rememberMe){
        return "updatePass";
    }

    @RequestMapping(value="/loginOut",method= RequestMethod.POST)
    public void loginOut(HttpServletRequest request){
        String username = request.getParameter("username");
        log.info("当前客户端：" + getServerIp() +" 的用户 ： " + username+ " 在 ：" + "登出系统" );
        try {
            loginOut(request);
        }catch (Exception e){
            log.error("系统异常！");
        }
    }

    @RequestMapping(value="/index",method= RequestMethod.POST)
    public String index(String username){
        log.info("当前客户端：" + getServerIp() +" 的用户 ： " + username+ " 在 ：" + "登出系统" );
        return "index";
    }



}
