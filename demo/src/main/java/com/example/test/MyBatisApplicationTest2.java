package com.example.test;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.impl.MyBatisUserService;
import com.example.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisApplicationTest2 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("mybatisApplication2.xml");
        MyBatisUserService userService = applicationContext.getBean("myBatisUserService", MyBatisUserService.class);
        userService.show();
    }
}
