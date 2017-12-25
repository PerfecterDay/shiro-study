package com.chinaums.bmp.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by BaIcy on 2017/12/25.
 *
 * @author BaIcy
 * @Date 2017/12/25 14:13
 */
@Controller
public class TestController {



    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String index(){
        return "login/login";
    }

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public String login(String name,String pwd){
        UsernamePasswordToken token = new UsernamePasswordToken(name,pwd);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        if (subject.isAuthenticated()){
            return "login/success";
        }

        return "login/success";
    }


    @RequestMapping(value = "user.do",method = RequestMethod.GET)
    public String user(){

        return "login/login";
    }

}
