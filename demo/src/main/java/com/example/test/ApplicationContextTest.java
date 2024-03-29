package com.example.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object userService = applicationContext.getBean("userService");
        System.out.println(userService);

        Object userServiceInit = applicationContext.getBean("userServiceInit");
        System.out.println(userServiceInit);

        Object userServiceArgs = applicationContext.getBean("userServiceArgs");
        System.out.println(userServiceArgs);

        applicationContext.close();
    }
}
