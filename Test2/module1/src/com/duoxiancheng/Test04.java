package com.duoxiancheng;

import java.util.concurrent.locks.ReentrantLock;

public class Test04 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    lock.lock();
                    System.out.println("虽");
                    System.out.println("远");
                    System.out.println("必");
                    System.out.println("诛");

                    lock.unlock();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    lock.lock();
                    System.out.println("犯");
                    System.out.println("我");
                    System.out.println("中");
                    System.out.println("华");
                    System.out.println("者");

                    lock.unlock();
                }
            }
        }.start();


    }
}
