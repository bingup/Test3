package com.com.day16.test10;

public class Test10 {
    public static void main(String[] args) {
        Person p = new Person();
        new Thread(){
            @Override
            public void run() {
                try {
                    p.show1("吖~","女人");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                try {
                    p.show2("啊！","男人");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}
