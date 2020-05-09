package com.sean.Service.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class StudentInvocationHandler implements InvocationHandler {

    Object target;

    public StudentInvocationHandler(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" + method.getName() + "方法");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
