package com.com.day15.test5;


public class Test {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();

        Thread t1 = new Thread(r1, "小黑");
        Thread t2 = new Thread(r1, "小红");
        Thread t3 = new Thread(r1, "小率");
        Thread t4 = new Thread(r1, "小白");
        Thread t5 = new Thread(r1, "小是");
        Thread t6 = new Thread(r1, "小我");
        Thread t7 = new Thread(r1, "小去");
        Thread t8 = new Thread(r1, "小额");
        Thread t9 = new Thread(r1, "小人");
        Thread t10 = new Thread(r1, "在红");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
//        new Thread(r1,"小鬼").start();
//        new Thread(r1,"校长").start();
//        new Thread(r1,"小兰").start();
//        new Thread(r1,"小吕").start();
//        new Thread(r1,"小王").start();
//        new Thread(r1,"小强").start();
//        new Thread(r1,"小明").start();
//        new Thread(r1,"小屋").start();
//        new Thread(r1,"小弟").start();
    }
}
