package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceInitImpl implements UserService, InitializingBean {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        System.out.println("set user dao:"+userDao);
        this.userDao = userDao;
    }
    public void init() {
        System.out.println("init UserServiceInitImpl");
    }
    public void destroy() {
        System.out.println("destroy UserServiceInitImpl");
    }

    // do not need xml config
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet of UserServiceInitImpl");
    }
}
