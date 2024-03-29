package com.example.factory;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<UserDao> {

    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
