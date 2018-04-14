<<<<<<< HEAD
package com.tt_ms.controller;

import com.tt_ms.common.IpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by mm on 2018/4/9.
 */
@Slf4j
@RestController
@RequestMapping("/")
public class BaseController implements Filter{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();
        boolean isLogin = false ;
        if(StringUtils.isEmpty(session.getAttribute("isLogin"))){
            session.setAttribute("isLogin",false);
        }
        String token = (String) session.getAttribute("token");
        if (!isLogin&& StringUtils.isEmpty(token)) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        req.getRequestDispatcher("/user/index").forward(req, res);
    }

    @Override
    public void destroy() {

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

    public void loginOut(HttpServletRequest request) {
        request.getSession().removeAttribute("isLogin");
        request.getSession().removeAttribute("token");
    }
}
=======
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
>>>>>>> 7bf5eb6c27f9d9393d6a32861b53d17e6215c8f3
