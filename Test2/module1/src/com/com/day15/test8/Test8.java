package com.com.day15.test8;

public class Test8 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("窗口a");
        MyThread thread2 = new MyThread("窗口b");
        MyThread thread3 = new MyThread("窗口c");
        MyThread thread4 = new MyThread("窗口d");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
