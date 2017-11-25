package com.test.Service.Impl;

import com.test.Entity.User;
import com.test.Service.UserService;
import org.omg.CORBA.UserException;

/**
 * Created by Administrator on 2017/11/25.
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public String getPassword(String password, String key) {
        return null;
    }

    @Override
    public void login(User getUser, String key) throws UserException {

    }
}
