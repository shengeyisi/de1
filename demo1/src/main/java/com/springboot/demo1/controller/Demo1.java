package com.springboot.demo1.controller;

import com.springboot.demo1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Demo1 {

    @Autowired
    private User user;

    @RequestMapping("d1")
    public String demo1(){
        return "hello";
    }

    @RequestMapping("d2")
    public User demo2(){
        return user;
    }
}
