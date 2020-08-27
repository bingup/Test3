package com.com.day16.test4;

public class MyRunable01 implements  Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        //计算10的!
        int sum = 1;
        for (int i = 10; i >0; i--) {
            sum *= i;
        }
        System.out.println("10!="+sum);
    }
}
