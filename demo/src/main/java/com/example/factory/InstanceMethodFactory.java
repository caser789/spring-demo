package com.example.factory;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoImpl;

public class InstanceMethodFactory {
    public UserDao userDao() {
        return new UserDaoImpl();
    }
}
