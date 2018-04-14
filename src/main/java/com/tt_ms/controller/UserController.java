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
 * Created by mm on 2018/4/9.
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
