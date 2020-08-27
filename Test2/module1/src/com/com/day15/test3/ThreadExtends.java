package com.com.day15.test3;

public class ThreadExtends extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
    }

    public ThreadExtends() {
    }

    public ThreadExtends(String name) {
        super(name);
    }
}
