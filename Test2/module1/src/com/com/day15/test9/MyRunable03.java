package com.com.day15.test9;

public class MyRunable03 implements Runnable {
    @Override
    public void run() {
        int sum = 1;
        for (int i = 5; i >0; i--) {
            sum *= i;
        }
        System.out.println("5!="+sum);
    }
}
