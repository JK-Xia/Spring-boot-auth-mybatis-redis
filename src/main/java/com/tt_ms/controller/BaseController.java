package com.tt_ms.controller;

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
public class BaseController  {
    //+ IpUtils.getIpAddr(request)
    private int serverPort;
    private String host ;
    private HttpServletRequest request;


    public String getServerPort(){
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        }catch (Exception e){
            log.error(e.getMessage());
        }

        return String.valueOf(address.toString() );
    }
}
