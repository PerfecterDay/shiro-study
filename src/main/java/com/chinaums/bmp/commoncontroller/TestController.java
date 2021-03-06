package com.chinaums.bmp.commoncontroller;

import com.chinaums.bmp.db.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by BaIcy on 2017/12/25.
 *
 * @author BaIcy
 * @Date 2017/12/25 14:13
 */
@Controller
public class TestController {



    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String index(){
        return "login/login";
    }

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    @ResponseBody
    public String login(String name,String pwd){
        UsernamePasswordToken token = new UsernamePasswordToken(name,pwd);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        if (subject.isAuthenticated()){
            return "login/success";
        }

        return "login/success";
    }


    @RequestMapping(value = "/user.do",method = RequestMethod.GET)
    public String user(){

        return "login/login";
    }


    @RequestMapping(value = "/oo.do",method = RequestMethod.GET)
    public String login(User user){
        UsernamePasswordToken token = new UsernamePasswordToken(user.getName(),user.getPwd());
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        if (subject.isAuthenticated()){
            return "login/success";
        }

        return "login/success";
    }
}
