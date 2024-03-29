package com.example.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class DruidTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object dataSource = applicationContext.getBean("connection");
        System.out.println(dataSource);
    }
}
