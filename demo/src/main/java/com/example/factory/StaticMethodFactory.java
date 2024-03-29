package com.example.factory;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoImpl;

public class StaticMethodFactory {
    public static UserDao userDao() {
        return new UserDaoImpl();
    }
}
