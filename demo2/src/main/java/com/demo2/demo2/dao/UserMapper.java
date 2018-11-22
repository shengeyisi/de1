package com.demo2.demo2.dao;

import com.demo2.demo2.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMapper extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {
    List<User> findUsersByAddress(String address);

    List<User> findUsersByAgeBetween(Integer low, Integer high);

    // List<User> findUsersByAgeBetweenAnd();

//    @Modifying
//    @Transactional
//    @Query(value = "update user set username=#{u.username},password=#{u.password},address=#{u.address},age=#{u.age} where id=#{u.id}",nativeQuery = true)
//    void  updateUserById(User u);
}
