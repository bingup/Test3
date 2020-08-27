package com.duoxiancheng;

public class Test02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    System.out.println("线程1------" + i);
                }
            }
        });
        t1.setDaemon(true);

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程二-----" + i);

                }
            }
        });

//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    System.out.println("线程三-----" + i);
//
//                }
//            }
//        });

        t1.start();
        t2.start();
//        t3.start();
    }
}
