package com.example.test;

import com.example.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");
        System.out.println(userService);

        List<String> stringList = userService.getStringList();
        System.out.println(stringList);

        Object userServiceInit = applicationContext.getBean("userServiceInit");
        System.out.println(userServiceInit);

        Object userServiceArgs = applicationContext.getBean("userServiceArgs");
        System.out.println(userServiceArgs);

        applicationContext.close();
    }
}
