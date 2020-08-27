package com.com.day15.test7;

public class MyRunable implements Runnable {
    private static  int num =80;
    @Override
    public void run() {

        while(true) {
            synchronized (Object.class) {
                if (num <= 0)
                    break;

                System.out.println(Thread.currentThread().getName() + "上车--还剩" + (--num) + "个座位");
            }
        }


    }
}
