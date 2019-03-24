package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    //用户登录
    User userlogin(@Param("username") String username, @Param("password") String password);

    //注册新用户(方式1)
    int adduser(User user);

    //注册新用户（方式2）
    int adduser1(@Param("username") String username, @Param("password") String password, @Param("age") int age);
}