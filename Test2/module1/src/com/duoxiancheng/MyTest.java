package com.duoxiancheng;

public class MyTest {
    public static void main(String[] args) {
        MyRunable my = new MyRunable();
        Thread t1 = new Thread(my,"q");
        Thread t2 = new Thread(my,"w");
        Thread t3 = new Thread(my,"e");
        t1.start();
        t2.start();
        t3.start();


    }
}
