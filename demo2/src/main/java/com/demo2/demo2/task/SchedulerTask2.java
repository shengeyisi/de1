package com.demo2.demo2.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class SchedulerTask2 {
  private static   LocalDateTime date = null;
  @Scheduled(fixedDelay = 6000)
  public void reportNowTime(){
      date = LocalDateTime.now();
      System.out.println("现在时间："+date);
  }
}
