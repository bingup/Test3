package com.com.day15.test4;

public class Test4 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 20; i++) {
                    System.out.println("显示画面");
                }
            }
        });

        th1.start();
        th2.start();
    }
}
