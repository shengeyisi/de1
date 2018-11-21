package com.demo2.demo2;

import com.demo2.demo2.dao.UserMapper;
import com.demo2.demo2.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Autowired
    private UserMapper us;
    @Test
    public void contextLoads() {
        User user1 = new User();
        User user2 = new User();
        User user3= new User();
//        user.setUsername("张飞");
//        user.setPassword("我是老三");
//        user.setAddress("蜀");
//        user.setAge(20);
//        user1.setUsername("刘备");
//        user1.setPassword("我是老大");
//        user1.setAddress("蜀");
//        user1.setAge(22);
//        user1.setUsername("关羽");
//        user1.setPassword("我是老二");
//        user1.setAddress("蜀");
//        user1.setAge(21);

//        user2.setUsername("曹操");
//        user2.setPassword("我是丞相");
//        user2.setAddress("魏");
//        user2.setAge(33);
//        user2.setUsername("郭嘉");
//        user2.setPassword("我是军师");
//        user2.setAddress("魏");
//        user2.setAge(22);
        user2.setUsername("荀彧");
        user2.setPassword("我是令君");
        user2.setAddress("魏");
        user2.setAge(35);

//        user3.setUsername("孙权");
//        user3.setPassword("我是君主");
//        user3.setAddress("吴");
//        user3.setAge(25);
//        user3.setUsername("周瑜");
//        user3.setPassword("我是都督");
//        user3.setAddress("吴");
//        user3.setAge(24);
        user3.setUsername("吕蒙");
        user3.setPassword("我也是都督");
        user3.setAddress("吴");
        user3.setAge(23);


//        us.save(user1);
        us.save(user2);
        us.save(user3);
    }

    @Test
    public void testQuery() {
        List<User> userList = us.findAll();
        System.out.println(userList);
    }


    @Test
    public void testQueryByAddress() {
        List<User> userList = us.findUsersByAddress("蜀");
        System.out.println(userList);
    }

    @Test
    public void testUpdateUserById() {
        User user = us.findById(2).get();
        user.setAge(33);
        us.save(user);
    }


    @Test
    public void testJpa() {

    }
}
