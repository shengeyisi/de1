package com.demo2.demo2.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
    private int count=0;
    @Scheduled(cron="*/6 * * * * ?")
    public void access(){
        count++;
        System.out.println("这个任务开始第"+count+"次运行");
    }
}
