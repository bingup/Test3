package com.com.day16.test3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es  = Executors.newCachedThreadPool();
        Future submit1 = es.submit(new MyCallable());
        Future submit2 = es.submit(new MyCallable());
        Future submit3 = es.submit(new MyCallable());
        double d = (double) submit1.get();
        double d1 = (double) submit2.get();
        double d2 = (double) submit3.get();
        double avg = (d+d1+d2)/3;
        System.out.println(avg);
    }
}
