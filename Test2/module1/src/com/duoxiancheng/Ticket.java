package com.duoxiancheng;

public class Ticket implements Runnable{
    private static Integer ticket =100;
    private static Object object =new Object();
    @Override
    public void run() {
        while (true) {

            synchronized (object) {
                if (ticket <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + (101 - ticket) + "" +
                        "张票");
                ticket--;
            }
        }
    }
}
