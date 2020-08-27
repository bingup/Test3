package com.duoxiancheng;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(2);
        Runnable01 r1 = new Runnable01();

        service.submit(r1);
    }
}
