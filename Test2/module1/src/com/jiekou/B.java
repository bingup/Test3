package com.jiekou;

public interface B {
    public void show();
    public  default void method(){
        System.out.println("BBBBBB");
    }
}
