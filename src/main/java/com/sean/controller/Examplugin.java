package com.sean.controller;


import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * @Author: sean.xu
 * @Date: 2020/6/8
 */
@Intercepts(@Signature(type = Executor.class, method = "update",args = {MappedStatement.class,Object.class}))
public class Examplugin implements Interceptor {
    public Object intercept(Invocation invocation) throws Throwable {
        return invocation.proceed();
    }

    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    public void setProperties(Properties properties) {

    }
}
