<<<<<<< HEAD
package com.tt_ms.controller;

import com.tt_ms.domain.User;
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
<<<<<<< HEAD
    public String login(String username, String password,String vcode,Boolean rememberMe,HttpServletRequest request){
        log.info("当前客户端：" + getClientIp(request) +" 的用户 ： " + username+ " 在服务 ：" +getServerIp() + "尝试登录系统..." );
        User dbuser;
        try{
          /*  UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
            SecurityUtils.getSubject().login(token);*/
            User user = new User();
            user.setUserName(username);
            user.setPassword(password);
            dbuser =userService.findUser(user);
            String token = UUID.randomUUID().toString();
            userService.setToken(token,dbuser);
            request.getSession().setAttribute("isLogin",true);
            request.getSession().setAttribute("token",token);
=======
    public String login(String username, String password,String vcode,Boolean rememberMe){
        log.info(getServerPort() );
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        MyThread t = new MyThread();
        t.run();
        //sdasd
        for(int i = 0; i < 10; i++){
            log.info(Thread.currentThread().getName()+ String.valueOf(i));
            if(i==1){
                try {
                    t.join();
                    log.info(Thread.currentThread().getName()+ String.valueOf(i));
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
>>>>>>> ac5e4f97fe7ce3a348748c41d3f91107987e76b1

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
=======
package com.tt_ms.controller;

import com.tt_ms.common.MyThread;
import com.tt_ms.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by mm on 2018/4/9.。
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;


    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(String username, String password,String vcode,Boolean rememberMe){
        log.info(getServerPort() );
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        MyThread t = new MyThread();
        t.run();
        for(int i = 0; i < 10; i++){
            log.info(Thread.currentThread().getName()+ String.valueOf(i));
            if(i==1){
                try {
                    t.join();
                    log.info(Thread.currentThread().getName()+ String.valueOf(i));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }


        SecurityUtils.getSubject().login(token);
        return "loginSuccess";
    }


    @RequestMapping(value="/addUser",method= RequestMethod.POST)
    public String addUser(String username, String password,String vcode,Boolean rememberMe){
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        SecurityUtils.getSubject().login(token);
        return "loginSuccess";
    }

    @RequestMapping(value="/updateUser",method= RequestMethod.POST)
    public String updateUser(String username, String password,String vcode,Boolean rememberMe){
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        SecurityUtils.getSubject().login(token);
        return "loginSuccess";
    }

    @RequestMapping(value="/findUser",method= RequestMethod.GET)
    public String findUser(String username, String password,String vcode,Boolean rememberMe){
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        SecurityUtils.getSubject().login(token);
        return "loginSuccess";
    }

    @RequestMapping(value="/updatePass",method= RequestMethod.POST)
    public String updatePass(String username, String password,String vcode,Boolean rememberMe){
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        SecurityUtils.getSubject().login(token);
        return "loginSuccess";
    }

}
>>>>>>> 7bf5eb6c27f9d9393d6a32861b53d17e6215c8f3
