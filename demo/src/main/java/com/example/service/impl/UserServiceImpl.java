package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private List<String> stringList;
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        System.out.println("set user dao:"+userDao);
        this.userDao = userDao;
    }
    public void init() {
        System.out.println("init UserServiceImpl");
    }
    public void destroy() {
        System.out.println("destroy UserServiceImpl");
    }
}
