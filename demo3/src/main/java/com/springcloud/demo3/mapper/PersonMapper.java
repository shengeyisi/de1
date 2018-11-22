package com.springcloud.demo3.mapper;

import com.springcloud.demo3.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service
public interface PersonMapper extends JpaRepository<Person,Integer>,JpaSpecificationExecutor<Person> {
}
