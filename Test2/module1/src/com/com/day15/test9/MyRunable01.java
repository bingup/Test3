package com.com.day15.test9;

public class MyRunable01 implements  Runnable {
    @Override
    public void run() {
        //计算10的!
        int sum = 1;
        for (int i = 10; i >0; i--) {
            sum *= i;
        }
        System.out.println("10!="+sum);
    }
}
