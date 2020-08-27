package com.duoxiancheng;

public class Product implements Runnable {
     private Bun bun =new Bun();

    public Product(Bun bun) {
        this.bun = bun;
    }
    //生产者，要生产包子！

    @Override
    public void run() {
        while(true) {
            synchronized (bun) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (bun.getNumber() > 10) {

                    //就不做包子了
                    try {
                        bun.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //一直做包子
                    bun.setNumber(bun.getNumber() + 1);
                    System.out.println("包子数量为" + bun.getNumber());

                    bun.notify();
                }
            }
        }
    }
}
