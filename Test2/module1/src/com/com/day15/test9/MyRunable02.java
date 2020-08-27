package com.com.day15.test9;

public class MyRunable02 implements Runnable {
    @Override
    public void run() {
        int sum = 1;
        for (int i = 8; i >0; i--) {
            sum *= i;
        }
        System.out.println("8!="+sum);
    }
}
