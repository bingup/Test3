package com.com.day15.test5;

public class MyRunnable implements Runnable {


    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName()+"来到这个山洞");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
