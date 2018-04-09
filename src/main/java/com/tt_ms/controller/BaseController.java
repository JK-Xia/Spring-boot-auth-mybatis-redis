package com.tt_ms.controller;

import com.tt_ms.domain.User;
import com.tt_ms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mm on 2018/4/9.
 */

@RestController
@RequestMapping("/")
public class BaseController {

    @Autowired
    private IUserService userService;

    //测试用例
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello,first blood";
    }

    @RequestMapping("/hello/{name}")
    public String helloTo(@PathVariable String name){
        return "hello,first blood and " + name;
    }

    @RequestMapping("/findUser/{username}")
    public String findUser(@PathVariable String username){
        User user = new User();
        user.setName(username);
        user.setPassword("123456");
        User dbUser = userService.findUser(user);
        return dbUser.toString();
    }
}
