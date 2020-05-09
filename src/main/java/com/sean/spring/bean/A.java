package com.sean.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: sean.xu
 * @Date: 2020/4/29
 */
public class A {

    private B bbb;

    private C ccc;

    public A(B bbb,C ccc){
        System.out.println("创建一个对象: 【"+this + "】");
    }
//    public void setBbb(B bbb) {
//        System.out.println("setting A.bbb with " + bbb);
//        this.bbb = bbb;
//    }
//    public void setCcc(C ccc) {
//        System.out.println("setting A.ccc with " + ccc);
//        this.ccc = ccc;
//    }
}
