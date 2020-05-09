package com.sean.Service.impl;

import com.sean.Service.Student;

/**
 * @Author: sean.xu
 * @Date: 2020/5/8
 */
public class StudentProxy implements Student {

    Student student;

    public StudentProxy(StudentImpl impl){
        this.student = impl;
    }

    public void handWork() {
        student.handWork();
    }
}
