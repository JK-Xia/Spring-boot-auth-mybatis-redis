package com.tt_ms.controller;

import com.tt_ms.common.IpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;

/**
 * Created by mm on 2018/4/9.
 */
@Slf4j
@RestController
@RequestMapping("/")
public class BaseController {




    public boolean isLogin(HttpServletRequest request){
        return true;
    }







    public String getServerIp() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return String.valueOf(address.toString());
    }

    public String getClientIp(HttpServletRequest request) {
       return IpUtils.getClientIp(request);
    }
}
