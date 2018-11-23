package com.demo2.demo2.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread implements Runnable {
//    private int num;
//
//    public MyThread(int num) {
//        this.num = num;
//    }
//
//    @Override
//    public void run() {
//
//        System.out.println(Thread.currentThread().getName() + "玩家[" + num + "]连接成功,资源中ing");
//        try {
//            Thread.sleep((int) (Math.random() * 10000 + 1000));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Thread.currentThread().getName() + "玩家[" + num + "]加载完毕，进入游戏！,当前时间：" + System.currentTimeMillis());
//
//    }


    private static final CyclicBarrier CYCLIC_BARRIER = new CyclicBarrier(5);

    private int num;

    public MyThread(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "玩家[" + num + "]连接成功,资源中ing");
        try {
            Thread.sleep((int) (Math.random() * 10000 + 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "玩家[" + num + "]加载完毕,等待其他玩家ing...当前时间："+System.currentTimeMillis());
        /**
         * 等待Barrier打破
         */
        try {
            CYCLIC_BARRIER.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "玩家[" + num + "]加载完毕，进入游戏！,当前时间：" + System.currentTimeMillis());
    }

}

