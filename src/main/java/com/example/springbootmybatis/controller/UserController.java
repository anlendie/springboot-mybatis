package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.pojo.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userMapper.getUserById(id);
    }

    @GetMapping("/user")
    public User insertUser(User user){
        int count = userMapper.insertUser(user);

        if(count > 0){
            System.out.println("插入数据成功");
        }

        return user;
    }

    @DeleteMapping("/delete/{id}")
    public int deleteUser(@PathVariable("id") Integer id){
        return userMapper.deleteUserById(id);
    }

    @PostMapping("/update")
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
}
