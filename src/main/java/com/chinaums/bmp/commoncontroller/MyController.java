package com.chinaums.bmp.commoncontroller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by BaIcy on 2017/12/27.
 *
 * @author BaIcy
 * @Date 2017/12/27 14:03
 */
public class MyController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("mypage");

        modelAndView.getModel().put("test","test");

        return modelAndView;
    }
}
