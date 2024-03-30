package com.example.postprocessor;

import com.example.advice.MyAdvice;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MockAopBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 1. 那些 bean 要增强？
        // 2. 用哪个类增强？
        if (bean.getClass().getPackage().getName().equals("com.example.service.impl")) {
            Object proxyBean = Proxy.newProxyInstance(
                    bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        MyAdvice adv = applicationContext.getBean(MyAdvice.class);
                        adv.before();
                        Object result = method.invoke(bean, args);
                        adv.after();
                        return result;
                    }
            );
            return proxyBean;
        }

        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
