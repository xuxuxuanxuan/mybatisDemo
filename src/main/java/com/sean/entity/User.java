package com.sean.entity;

import com.sean.enums.SexEnum;
import lombok.Data;

import java.util.Date;

/**
 * @Author: sean.xu
 * @Date: 2020/4/16
 */
@Data
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String mobile;

    private Date createTime;


}
