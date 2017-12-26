package com.chinaums.bmp.restcontroller;

import com.alibaba.fastjson.JSONObject;
import com.chinaums.bmp.db.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by BaIcy on 2017/12/26.
 *
 * @author BaIcy
 * @Date 2017/12/26 15:18
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public Map index(){
        Map jsonObject = new JSONObject();
        jsonObject.put("test","hello");
        return jsonObject;
    }

    @RequestMapping(value = "/oo.do",method = RequestMethod.GET)
    public User login(User user){
        return user;
    }
}
