package com.com.day16.test4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new MyRunable01());
        es.submit(new MyRunable02());
        es.submit(new MyRunable03());
    }
}
