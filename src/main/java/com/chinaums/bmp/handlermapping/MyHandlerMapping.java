package com.chinaums.bmp.handlermapping;

import com.chinaums.bmp.commoncontroller.MyController;
import com.chinaums.bmp.servlet.MyServlet;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by BaIcy on 2017/12/27.
 *
 * @author BaIcy
 * @Date 2017/12/27 13:49
 */
public class MyHandlerMapping extends AbstractHandlerMapping {

    @Override
    protected Object getHandlerInternal(HttpServletRequest httpServletRequest) throws Exception {
//        return new MyController();

        return new MyServlet();
    }
}
