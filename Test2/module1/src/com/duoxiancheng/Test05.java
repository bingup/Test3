package com.duoxiancheng;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test05 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        service.submit(()->{
            try {
                Thread.sleep(5010);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(1234);
        });


        service.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1010);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("nimasile");
                }
            }
        });

    }
}
