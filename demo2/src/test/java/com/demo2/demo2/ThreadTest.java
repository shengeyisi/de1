package com.demo2.demo2;

import com.demo2.demo2.cyclicBarrier.MyThread;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(SpringJUnit4ClassRunner.class)
public class ThreadTest {


    @Test
    public void testLoading() throws Exception{
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new MyThread(i));
            thread.start();
        }
    }

    @Test
    public void testSort() {
        int [] arr ={23,55,11,5,322,1111};
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]) {
                    k=j;
                }
            }
            if (k!=i) {
                int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
            }
        }
        boolean equals = "1".equals("1");
        System.out.println(equals);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void justTest() {
//        String[] str = new String[] { "you", "wu" };
//        List list = Arrays.asList(str);
//        str[0] = "hui";
////        list.add("3");  不能使用add方法 asList 的返回对象是一个 Arrays 内部类，并没有实现集合的修改方法
//        System.out.println(list);

//        Map map = new HashMap(16);
//        map.put("1","校长");
//        map.put("2","小王");
//        map.put("3","老王");
//        map.forEach((k,v)-> System.out.println(k+":"+v));




    }
}
