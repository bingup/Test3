package com.duoxiancheng;

public class Test {
    public static void main(String[] args) {
//        MyThread mt = new MyThread("1");
//        mt.start();
//        MyThread mt2 = new MyThread("2");
//        mt2.start();
//
//        for(int i=0;i<10;i++){
//            System.out.println("main");
//        }
//        MyRunable my = new MyRunable();
//        Thread t1 =new Thread(my);
//        t1.start();
//        //匿名内部类实现线程的创建
//        Runnable my1 =new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("caonimab");
//            }
//        };
//        new Thread(my1).start();

        new Thread() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    if(i==50){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName());

                }
            }
        }.run();

        new Thread(){
            @Override
            public void run() {
                System.out.println("123");
                System.out.println("123");
                System.out.println("123");
                System.out.println("123");
                System.out.println("123");
                System.out.println("123");
                System.out.println("123");
            }
        }.run();

    }

}
