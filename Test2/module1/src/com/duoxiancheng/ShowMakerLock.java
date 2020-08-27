package com.duoxiancheng;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ShowMakerLock {
    ReentrantLock lock =new ReentrantLock();

    Condition c1;
    Condition c2;
    Condition c3;

    public ShowMakerLock(){
        c1 = lock.newCondition();
        c2 = lock.newCondition();
        c3 = lock.newCondition();
    }

    int count = 1;

    public synchronized void show() throws InterruptedException {
            lock.lock();
            while (count != 1) {
                c1.await();//让当前的线程等待
            }
            Thread.sleep(10);
            System.out.println("我");
            System.out.println("是");
            System.out.println("你");
            System.out.println("吧");
            System.out.println("吧");
            System.out.println("啊");
            count = 2;
            c2.signal();
            lock.unlock();


    }

    public void show1() throws InterruptedException {
                lock.lock();
            while (count != 2) {
                c2.await();
            }
            Thread.sleep(10);
            System.out.println("s");
            System.out.println("b");
            System.out.println("w");
            System.out.println("d");
            System.out.println("n");
            System.out.println("m");
            count = 3;
            c3.signal();
            lock.unlock();

    }


    public void show2() throws InterruptedException {
            lock.lock();
            while (count != 3) {
                c3.await();
            }
            Thread.sleep(10);
            System.out.println("s");
            System.out.println("b");
            System.out.println("w");
            System.out.println("d");
            System.out.println("n");
            System.out.println("m");
            count = 1;
            c1.signal();
            lock.unlock();


    }
}
