package com.com.day15.test3;

public class RunnableTest implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
