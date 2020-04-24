package com.sean.mapper;

import com.sean.entity.Grade;

import java.util.List;

/**
 * @Author: sean.xu
 * @Date: 2020/4/20
 */
public interface GradeMapper {

    Grade findGradeBySlogan(String slogan);

}
