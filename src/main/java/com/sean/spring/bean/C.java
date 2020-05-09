package com.sean.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: sean.xu
 * @Date: 2020/4/29
 */
public class C {
    private B bbb;
//
//    public C(B bbb){
//        System.out.println("创建一个对象: 【"+this + "】");
//    }


    @Autowired
    public void setBbb(B bbb) {
        this.bbb = bbb;
    }
}
