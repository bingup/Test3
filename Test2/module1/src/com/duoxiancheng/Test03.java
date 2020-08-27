package com.duoxiancheng;

public class Test03 {
    public static void main(String[] args) {
//        Ticket ticket  = new Ticket();
//        Thread t1 =new Thread(ticket,"一号");
//        Thread t2 =new Thread(ticket,"二号");
//        Thread t3 =new Thread(ticket,"三号");
//        t1.start();
//        t2.start();
//        t3.start();
        ShowMaker showMaker =new ShowMaker();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <30 ; i++) {
                    try {
                        showMaker.show1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <30 ; i++) {
                    try {
                        showMaker.show();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }


}
