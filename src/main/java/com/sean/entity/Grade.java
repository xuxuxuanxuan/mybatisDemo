package com.sean.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: sean.xu
 * @Date: 2020/4/20
 */
@Data
public class Grade {

    private Long gid;

    /**
     * 班级名字
     */
    private String className;

    /**
     * 班级口号
     */
    private String slogan;

    /**
     * 班级学生
     */
    private List<Student> studentList;

    /**
     * 班级荣誉
     */
    private List<Honor> honorList;
}
