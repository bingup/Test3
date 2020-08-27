package com.com.day15.test3;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("main线程！！");
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest,"线程二");
        thread.start();
    }
}
