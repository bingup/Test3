package com.com.day16.test4;

public class MyRunable03 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        int sum = 1;
        for (int i = 5; i >0; i--) {
            sum *= i;
        }
        System.out.println("5!="+sum);
    }
}
