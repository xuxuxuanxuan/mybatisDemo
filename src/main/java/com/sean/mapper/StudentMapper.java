package com.sean.mapper;

import com.sean.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: sean.xu
 * @Date: 2020/4/20
 */
public interface StudentMapper {

    Student findStudentByIdCard(@Param("idCard") String idCard);
}
