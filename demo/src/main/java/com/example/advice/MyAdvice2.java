package com.example.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyAdvice2 implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("afterReturning my adivce 2");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before my adivce 2");
    }
}
