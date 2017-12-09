package com.p2p.sso.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 创建者: 5145 创建时间: 2017/11/30.
 * 名字:mall
 */
@Controller
//@RequestMapping("login")
public class UserController {
    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 跳转到登陆页面
     * @return
     */
    @RequestMapping("toLogin")
    public String toLogin(){ return "login.html"; }

    @RequestMapping("toRegister")
    public String toRegister(){ return "register.html"; }

    /**
     * 登陆: 存cookie 存redis
     * @param account
     * @param pwd
     * @param res
     * @return
     */
    @RequestMapping("loginToken")
    @ResponseBody
    public String login(String account, String pwd, HttpServletResponse res) {
        //"aa" 从redis里面拿
        if (account.equals("aa")) {
            //令牌
            String token = UUID.randomUUID().toString();
            //存入redis,并设置过期时间
            redisTemplate.opsForValue().set(token, "aa");
            redisTemplate.expire(token, 60, TimeUnit.SECONDS);

            Cookie cookie = new Cookie("isLogin", token);
            cookie.setMaxAge(60);
            cookie.setPath("/");
            res.addCookie(cookie);
            return "http://localhost:8082/cart/lookcart";
        } else {
            return "login.html";
        }
    }

    @RequestMapping("register")
    public String register(){

        return "register.html";
    }

    /**
     * 防止自定义cookie
     * @param token
     * @return
     */
    @RequestMapping("tokenIsHad/{token}")
    @ResponseBody
    public String tokenIsHad(@PathVariable String token) {
        System.out.println("tokenIsHad + " + token);
        Object o = redisTemplate.opsForValue().get(token);
        if (o != null && o.equals("aa")) {
            return "1";
        } else {
            return "0";
        }
    }
}
