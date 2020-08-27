package com.com.day011.test4;

public class Worker {
    public void pickApple(CompareAble c,Apple a1,Apple a2){
        Apple a = c.compare(a1,a2);
        System.out.println(a);
    }
}
