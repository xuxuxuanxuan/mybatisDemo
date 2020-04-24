package com.sean.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: sean.xu
 * @Date: 2020/4/20
 */
@Data
public class Honor {

    private Long hid;

    private String honorName;

    private List<Grade> gradeList;

}
