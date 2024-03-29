package com.example.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DruidTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object dataSource = applicationContext.getBean("connection");
        System.out.println(dataSource);

        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Date parse = simpleDateFormat.parse("2023-10-11");
        Object date = applicationContext.getBean("date");
        System.out.println(date);

        // mybatis
        // static factory method
        // InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        // new
        // SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // instance factory method
        // SqlSessionFactory factory = builder.build(stream);

        // SqlSessionFactory factory = applicationContext.getBean("sqlSessionFactory", SqlSessionFactory.class);
        // System.out.println(factory);
        // SqlSession session = factory.openSession();
        // System.out.println(session);

        SqlSession session = applicationContext.getBean("session", SqlSession.class);
        System.out.println(session);
        SqlSession session1 = applicationContext.getBean("session", SqlSession.class);
        System.out.println(session1);
    }
}
