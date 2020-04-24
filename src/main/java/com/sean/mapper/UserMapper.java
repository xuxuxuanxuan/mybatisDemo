package com.sean.mapper;

import com.sean.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User findUserByName(@Param("name") String name);

    User findUser(@Param("age") Integer age,@Param("name") String name,@Param("mobile") String mobile);

    List<User> findUserByAge(@Param("ageArray") int[] ageArray);

    void insertUser(User user);

    void updateUserByName(@Param("mobile") String mobile,@Param("name") String name);

    void deleteUser(String name);

}
