package com.sean.spring.bean;

/**
 * @Author: sean.xu
 * @Date: 2020/4/30
 */
public class UserFactory {

    private static UserFactory userFactory = new UserFactory();
    private UserFactory() {}

    public static UserFactory createInstance() {
        return userFactory;
    }
}
