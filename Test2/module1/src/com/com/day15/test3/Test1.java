package com.com.day15.test3;

import com.com.day14.test27.ThreadTest;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("这是主线程");
        ThreadExtends thread = new ThreadExtends("线程一");
        thread.start();

    }
}
