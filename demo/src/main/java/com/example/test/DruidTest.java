package com.example.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DruidTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object dataSource = applicationContext.getBean("connection");
        System.out.println(dataSource);

        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Date parse = simpleDateFormat.parse("2023-10-11");
        Object date = applicationContext.getBean("date");
        System.out.println(date);
    }
}
