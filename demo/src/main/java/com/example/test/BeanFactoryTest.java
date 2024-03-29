package com.example.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
        // 1. create bean factory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. load xml file
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // 3. factory bind xml
        reader.loadBeanDefinitions("beans.xml");
        // 4. get bean by id
        Object userService = beanFactory.getBean("userService");
        System.out.println(userService);

        Object userDao = beanFactory.getBean("userDao");
        System.out.println(userDao);
    }
}
