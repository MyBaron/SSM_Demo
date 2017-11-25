package com.test.Service;


import com.test.Entity.User;
import org.omg.CORBA.UserException;

/**
 * Created by Administrator on 2017/10/23.
 */
public interface UserService {

    //根据账号获取User
    User getUser(String username);

    //解密获取到密码
    String getPassword(String password, String key);

    //登录
    void login(User getUser, String key) throws UserException;

    //注册

}
