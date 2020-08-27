package com.com.day15.test6;

public class Test6 {
    public static void main(String[] args) {
        MyRunable my = new MyRunable();
        Thread thread1 = new Thread(my,"实体店");
        Thread thread2 = new Thread(my,"官网");
        thread1.start();
        thread2.start();
    }
}
