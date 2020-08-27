package com.com.day16.test3;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable  implements Callable<Double> {
    @Override
    public Double call() throws Exception {
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int a = r.nextInt(100)+1;
            sum += a;
        }

        return (sum/10.0);
    }
}
