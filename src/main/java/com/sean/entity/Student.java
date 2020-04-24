package com.sean.entity;

import lombok.Data;

/**
 * @Author: sean.xu
 * @Date: 2020/4/20
 */
@Data
public class Student {

    private Long sid;

    /**
     * 学生证
     */
    private String idCard;

    /**
     * 姓名
     */
    private String name;

    /**
     * 班级
     */
    private Grade grade;

}
