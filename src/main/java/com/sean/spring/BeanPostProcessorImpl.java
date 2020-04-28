package com.sean.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: sean.xu
 * @Date: 2020/4/28
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【"+this.getClass().getSimpleName()+"】"+beanName + "开始实例化");
        return  bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【"+this.getClass().getSimpleName()+"】"+beanName + "实例化完成");
        return  bean;
    }
}
