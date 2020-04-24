package com.sean.factory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Properties;

/**
 * @Author: sean.xu
 * @Date: 2020/4/18
 */
public class MyObjectFactory extends DefaultObjectFactory {

    private static final long serialVersionUID = -7924251036323382165L;

   Logger logger = Logger.getLogger(MyObjectFactory.class);

    private Object temp = null;

    public void setProperties(Properties properties) {
        super.setProperties(properties);
        logger.info("初始化参数：--------"+properties.toString());
    }

    //方法2
    public <T> T create(Class<T> type) {
        T result = super.create(type);
        logger.info("创建对象：--------"+result.toString());
        logger.info("是否和上次创建的是同一个对象：【"+temp.equals(result) +"】");
        return result;
    }

    //方法1
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        T result = super.create(type, constructorArgTypes, constructorArgs);
        logger.info("创建对象：--------"+result.toString());
        temp = result;
        return result;
    }

    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}
