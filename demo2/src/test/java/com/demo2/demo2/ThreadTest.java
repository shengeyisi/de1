package com.demo2.demo2;

import com.demo2.demo2.cyclicBarrier.MyThread;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

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
        System.out.println(Arrays.toString(arr));
    }
}
