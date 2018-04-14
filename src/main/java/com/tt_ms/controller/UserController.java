package com.tt_ms.controller;

import com.tt_ms.domain.User;
import com.tt_ms.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by mm on 2018/4/9.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;


    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(String username, String password,String vcode,Boolean rememberMe,HttpServletRequest request){
        log.info("当前客户端：" + getClientIp(request) +" 的用户 ： " + username+ " 在服务 ：" +getServerIp() + "尝试登录系统..." );
        try{
            UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
            SecurityUtils.getSubject().login(token);
            User user = new User();
            user.setUserName(username);
            user.setPassword(password);
            userService.findUser(user);
        }catch (Exception e){
            log.error("当前客户端：" + getClientIp(request) +" 的用户 ： " +username+ " 在 ：时间段" + "登录系统失败！" );
        }
        log.info("当前客户端：" + getClientIp(request) +" 的用户 ： " + username+ " 在服务 ：" +getServerIp() + "登录系统成功!" );
        return "loginSuccess";
    }


    @RequestMapping(value="/addUser",method= RequestMethod.POST)
    public String addUser(String username, String password,String vcode,Boolean rememberMe){
        return "loginSuccess";
    }

    @RequestMapping(value="/updateUser",method= RequestMethod.POST)
    public String updateUser(String username, String password,String vcode,Boolean rememberMe){
        return "loginSuccess";
    }

    @RequestMapping(value="/findUser",method= RequestMethod.GET)
    public String findUser(String username, HttpServletRequest request){
        log.info("当前客户端：" + getClientIp(request) +" 的用户 ： " + username+ " 在 ：时间段 在 ：" +getServerIp() + "登录系统..." );
        return "loginSuccess";
    }

    @RequestMapping(value="/updatePass",method= RequestMethod.POST)
    public String updatePass(String username, String password,String vcode,Boolean rememberMe){
        return "loginSuccess";
    }

    @RequestMapping(value="/loginOut",method= RequestMethod.POST)
    public String loginOut(String username){
        log.info("当前客户端：" + getServerIp() +" 的用户 ： " + username+ " 在 ：" + "登出系统" );
        return "loginOutSuccess";
    }



}
