package com.com.day15.test7;

public class Test7 {
    public static void main(String[] args) {
        MyRunable r1 = new MyRunable();
        Thread t1 = new Thread(r1,"前门");
        Thread t2 = new Thread(r1,"中门");
        Thread t3 = new Thread(r1,"后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
