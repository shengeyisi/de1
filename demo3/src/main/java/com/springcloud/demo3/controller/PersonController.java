package com.springcloud.demo3.controller;

import com.springcloud.demo3.mapper.PersonMapper;
import com.springcloud.demo3.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonMapper pm;

    @RequestMapping("addPerson")
    public List<Person> addPerson(){
        Person p = new Person();
        p.setName("张");
        p.setGender("男");
        p.setAge(33);
        pm.save(p);
        return pm.findAll();
    }

}
