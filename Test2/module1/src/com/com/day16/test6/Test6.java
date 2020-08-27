package com.com.day16.test6;

public class Test6 {
    public static void main(String[] args) {
        //lambda表达式
        invokeDirector(()->{
            System.out.println("导演拍电影啦!");
        });
        //lambda表达式省略
        invokeDirector(()-> System.out.println("导演拍电影啦！"));
    }

    private static void invokeDirector(Director director) {
            director.makerMovie();
    }
}
