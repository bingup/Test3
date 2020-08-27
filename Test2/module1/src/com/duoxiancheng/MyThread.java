package com.duoxiancheng;

public class MyThread extends Thread{
    public MyThread(String name){
        //调用父类的String参数的构造方法，指定线程的名字
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i+"正在执行");
        }
    }
}
