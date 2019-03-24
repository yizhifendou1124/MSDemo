package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    /**
     * 注入dao
     */
    @Autowired
    private UserMapper usermapper;

    //用户登录
    public User userLogin(String username, String password) {
        User user = usermapper.userlogin(username, password);
        return user;
    }

    //注册新用户
    public int adduser(String username, String password, int age) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        int result = usermapper.adduser(user);
        System.out.println("=======id======" + user.getId());
        return result;
        //return usermapper.adduser1(username,password,age);     //对应sql语句中的第二种注册方式
    }
}