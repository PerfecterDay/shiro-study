package com.chinaums.bmp.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;

/**
 * Created by BaIcy on 2017/12/25.
 *
 * @author BaIcy
 * @Date 2017/12/25 15:26
 */
public class MyRealm extends AuthenticatingRealm{


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        /*调用全名付登录验证接口*/

        if (Math.random() * 100 < 100){

            return
                    new SimpleAuthenticationInfo(authenticationToken.getPrincipal(),
                            authenticationToken.getCredentials(),getName());
        }else {
            throw new AuthenticationException();
        }
    }
}
