package com.com.day10.test2;

public interface A {
    public abstract void showA();

    public default void showB(){
        System.out.println("BBBB");
    }
}
