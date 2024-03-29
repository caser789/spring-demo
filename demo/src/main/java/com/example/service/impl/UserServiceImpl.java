package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        System.out.println("set user dao:"+userDao);
        this.userDao = userDao;
    }
}
