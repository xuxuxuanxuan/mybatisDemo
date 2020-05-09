package com.sean.Service.impl;

import com.sean.Service.Student;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class StudentImpl implements Student {

    private String name;

    public StudentImpl(String name){
        this.name = name;
    }


    public void handWork() {
        System.out.println(name + "交作业");
    }

}
