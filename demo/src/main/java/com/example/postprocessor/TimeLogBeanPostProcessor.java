package com.example.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class TimeLogBeanPostProcessor implements BeanPostProcessor {

    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // use proxy to enhance bean
        // return proxy
        Object proxyBean = Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    // 1. print start time
                    System.out.println("method start time: " + method.getName() + new Date());
                    // 2. invoke
                    Object result = method.invoke(bean, args);
                    // 3. print end time
                    System.out.println("method end time: " + method.getName() + new Date());
                    return result;
                }
        );
        return proxyBean;
    }
}
