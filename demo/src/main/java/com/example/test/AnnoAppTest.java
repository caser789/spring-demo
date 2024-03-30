package com.example.test;

import com.example.advice.MyAdvice;
import com.example.service.UserService;
import com.example.service.impl.AnnoUserServiceImpl;
import com.example.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoAppTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annoAppTest.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show1();
    }
}
