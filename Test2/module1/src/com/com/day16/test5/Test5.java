package com.com.day16.test5;

public class Test5 implements Runnable {

    public void run(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Test5());
        t.start();
    }

    @Override
    public void run() {

    }
    //该程序的运行结果是test5不能运行，因为没有重写run方法
}
