package com.tt_ms.common;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by mm on 2018/4/13.
 */
@Slf4j
public class MyThread extends Thread {

    public void run(){

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        log.info(Thread.currentThread().getName() + "MyThread");
        try {
            Thread.sleep(3000);//当前线程睡眠一秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
