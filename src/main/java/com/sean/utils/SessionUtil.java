package com.sean.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @Author: sean.xu
 * @Date: 2020/4/20
 */
public class SessionUtil {

    public static SqlSession getSession(){
        SqlSessionFactory sqlSessionFactory = null;
        String resource = "mybatis-config.xml";
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory.openSession();
    }
}
