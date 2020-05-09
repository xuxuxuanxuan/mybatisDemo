package com.sean.spring.bean;

import java.beans.ConstructorProperties;

/**
 * @Author: sean.xu
 * @Date: 2020/4/30
 */
public class ExampleBean {

    private int years;

    private String ultimateAnswer;

    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    public String getExample(){
        String user = String.valueOf(years) + ultimateAnswer;
        return user;
    }
}
