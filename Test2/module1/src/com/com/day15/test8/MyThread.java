package com.com.day15.test8;



public class MyThread  extends  Thread{


    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    private static  int num  =200;

    @Override
    public void run() {
        while(true){
            synchronized (Object.class){
                if (num <=0 )
                    break;

                System.out.println(getName()+"卖了一张票，剩余票数为"+--num);
            }
        }
    }
}
