package com.com.day12.test6;

public class Test61 {
    //泛型方法
    public static void main(String[] args) {
        show("abc");
        show(123);
    }
    public static <N> void show(N n){
        System.out.println(n.getClass());
    }
}
