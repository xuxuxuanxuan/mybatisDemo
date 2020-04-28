package com.sean.entity;

import com.sean.enums.SexEnum;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: sean.xu
 * @Date: 2020/4/16
 */
@Data
@Component(value = "user")
public class User implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private Long id;

    @Value("丽丽")
    private String name;

    @Value("16")
    private Integer age;

    private String mobile;

    private Date createTime;

    private SexEnum gender;

    public void init(){
        System.out.println("【"+this.getClass().getSimpleName()+"】" + "执行自定义初始化方法");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【"+this.getClass().getSimpleName()+"】" + "setBeanFactory");
    }

    public String getUser(){
        String user = "我的名字是"+ name+"我今年" + age+"岁";
        return user;
    }

    public void setBeanName(String s) {
        System.out.println("【"+this.getClass().getSimpleName()+"】"+ "setBeanName");
    }

    public void myDestroy() throws Exception {
        System.out.println("【"+this.getClass().getSimpleName()+"】"+ "自定义销毁");
    }

    public void destroy() throws Exception {
        System.out.println("【"+this.getClass().getSimpleName()+"】"+ "destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("【"+this.getClass().getSimpleName()+"】" + "afterPropertiesSet");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【"+this.getClass().getSimpleName()+"】"+ "setApplicationContext");
    }
}
