package com.sean.spring;

import com.sean.enums.SexEnum;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
import java.util.Date;

/**
 * @Author: sean.xu
 * @Date: 2020/4/16
 */
@Component
public class User{

    private Long id;

    private String name;

    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Autowired
    @Value("无敌")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Autowired
    @Value("25")
    public void setAge(Integer age) {
        this.age = age;
    }


    public String getUser(){
        String user = "我的名字是"+ name+"我今年" + age+"岁";
        return user;
    }

//    public void init(){
//        System.out.println("【"+this.getClass().getSimpleName()+"】" + "执行自定义初始化方法");
//    }
//
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("【"+this.getClass().getSimpleName()+"】" + "setBeanFactory");
//    }
//
//    public void setBeanName(String s) {
//        System.out.println("【"+this.getClass().getSimpleName()+"】"+ "setBeanName");
//    }
//
//    public void myDestroy() throws Exception {
//        System.out.println("【"+this.getClass().getSimpleName()+"】"+ "自定义销毁");
//    }
//
//    public void destroy() throws Exception {
//        System.out.println("【"+this.getClass().getSimpleName()+"】"+ "destroy");
//    }
//
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("【"+this.getClass().getSimpleName()+"】" + "afterPropertiesSet");
//    }
//
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("【"+this.getClass().getSimpleName()+"】"+ "setApplicationContext");
//    }
}
