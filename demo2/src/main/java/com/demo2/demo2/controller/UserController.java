package com.demo2.demo2.controller;

import com.demo2.demo2.commons.Result;
import com.demo2.demo2.dao.UserMapper;
import com.demo2.demo2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("deleteById")
    public Result deleteById(){
        um.deleteById(11);
        return new Result(true,200,"删除成功");
    }

    @RequestMapping("findOneById/{id}")
    public User findOneById(@PathVariable Integer id){
        return um.findById(id).get();
    }
    @RequestMapping("findByAddress/{address}")
    public List<User> findUserByAddress(@PathVariable String address){
        System.out.println(address);
        return um.findUsersByAddress(address);
    }
    @RequestMapping("findByAgeBetween/{low}/{high}")
    public List<User> findByAgeBetween(@PathVariable Integer low,@PathVariable Integer high){
        return um.findUsersByAgeBetween(low,high);
    }
}
