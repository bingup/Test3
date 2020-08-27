package com.com.day14.test27;

import java.util.Random;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        int end = 1000;
        int strat = 100;
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            int number = random.nextInt(end - strat + 1) + strat;
            sum += number;
        }
        System.out.println(sum);

    }
}
