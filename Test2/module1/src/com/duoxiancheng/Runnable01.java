package com.duoxiancheng;

public class Runnable01 implements Runnable{

    @Override
    public void run() {
        System.out.println("教练给老子滚过来");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来给我"+Thread.currentThread().getName());
    }
}
