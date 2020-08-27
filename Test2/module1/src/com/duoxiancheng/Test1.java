package com.duoxiancheng;

public class Test1 {
    public static void main(String[] args) {
        //匿名内部类创建对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {

                    System.out.println("111111111这个线程先运行了");

                }


            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("2222222222这个线程先运行了");

                }


            }
        }).start();
    }
}
