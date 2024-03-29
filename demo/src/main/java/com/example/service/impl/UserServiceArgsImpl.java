package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.service.UserService;

public class UserServiceArgsImpl implements UserService {
    public UserServiceArgsImpl(String name) {
        System.out.println("construct UserServiceArgsImpl: name="+name);
    }
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        System.out.println("set user dao:"+userDao);
        this.userDao = userDao;
    }
    public void init() {
        System.out.println("init UserServiceArgsImpl");
    }
    public void destroy() {
        System.out.println("destroy UserServiceArgsImpl");
    }
}
