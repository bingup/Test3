package com.com.day16.test4;

public class MyRunable02 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        int sum = 1;
        for (int i = 8; i >0; i--) {
            sum *= i;
        }
        System.out.println("8!="+sum);
    }
}
