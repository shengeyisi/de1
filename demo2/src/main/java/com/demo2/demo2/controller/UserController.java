package com.demo2.demo2.controller;

import com.demo2.demo2.commons.Result;
import com.demo2.demo2.dao.UserMapper;
import com.demo2.demo2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserMapper um;

    @RequestMapping("findAll")
    public List<User> findAll(){
        return um.findAll();
    }
    @RequestMapping("findUserByAddress")
    public List<User> findUserByAddress(){
        return um.findUsersByAddress("蜀");
    }

    @RequestMapping("addUser")
    public Result addUser(){
        User user = new User();
        user.setUsername("赵云");
        user.setPassword("五虎上将");
        user.setAddress("蜀");
        user.setAge(19);
        um.save(user);
        return new Result(true,200,"保存成功");
    }
}
