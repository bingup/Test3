package com.duoxiancheng;

public class ShowMaker01 {
    int count = 1;

    public synchronized void show() throws InterruptedException {
        synchronized (Object.class) {
            while (count != 1) {
                Object.class.wait();
            }
            Thread.sleep(10);
            System.out.println("我");
            System.out.println("是");
            System.out.println("你");
            System.out.println("吧");
            System.out.println("吧");
            System.out.println("啊");
            count = 2;
            Object.class.notifyAll();
        }

    }

    public void show1() throws InterruptedException {
        synchronized (Object.class) {
            while (count != 2) {
                Object.class.wait();
            }
            Thread.sleep(10);
            System.out.println("s");
            System.out.println("b");
            System.out.println("w");
            System.out.println("d");
            System.out.println("n");
            System.out.println("m");
            count = 3;
            Object.class.notifyAll();
        }
    }


    public void show2() throws InterruptedException {
        synchronized (Object.class) {
            while (count != 3) {
                Object.class.wait();
            }
            Thread.sleep(10);
            System.out.println("s");
            System.out.println("b");
            System.out.println("w");
            System.out.println("d");
            System.out.println("n");
            System.out.println("m");
            count = 1;
            Object.class.notifyAll();
        }
    }
}
