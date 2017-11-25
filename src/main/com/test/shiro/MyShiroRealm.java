package com.test.shiro;


import com.test.Entity.Role;
import com.test.Entity.User;
import com.test.Service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.List;
import java.util.Optional;

/**
 * Created by Administrator on 2017/10/23.
 */
public class MyShiroRealm extends AuthorizingRealm{

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {

        //方法一：获得user对象
        User user=(User)pc.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        if (user!=null){
            List<Role> roles = user.getRoles();
            for(Role r:roles){
                info.addRole(r.getRole_name());
            }

        }

        return info;
    }

    /**
     *
     * 登录授权
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token =(UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        //查询数据库获取账号
        Optional<User> user = Optional.ofNullable(userService.getUser(username));

       // System.out.println("我获取到的user" + user);
        // 第一个参数是对象 第二个参数是密码
        return user.map(user1 -> new SimpleAuthenticationInfo(user1, user1.getPassword(), getName())).orElse(null);

    }

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
