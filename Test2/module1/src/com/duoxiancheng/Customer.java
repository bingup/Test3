package com.duoxiancheng;

public class Customer implements Runnable {
    private Bun bun =new Bun();

    public Customer(Bun bun) {
        this.bun = bun;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (bun) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (bun.getNumber() > 5) {
                    //傻狗来吃包子了
                    System.out.println("傻狗吃了一个包子");
                    bun.setNumber(bun.getNumber() - 1);
                    //
                    bun.notify();
                } else {
                    try {
                        bun.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
