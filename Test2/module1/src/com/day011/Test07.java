package com.day011;


import java.util.ArrayList;

public class Test07 implements Runnable {
    public static void main(String[] args) {
//        Thread t = new Thread(new Test07());
//        t.start();
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a);
    }


        public void run (){
            for (int i = 0; i < 8; i++) {
                System.out.println(i);
            }
        }


}
