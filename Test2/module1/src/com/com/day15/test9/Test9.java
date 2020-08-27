package com.com.day15.test9;

public class Test9 {
    public static void main(String[] args) {
        new Thread(new MyRunable01()).start();
        new Thread(new MyRunable02()).start();
        new Thread(new MyRunable03()).start();

    }
}
