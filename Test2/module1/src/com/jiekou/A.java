package com.jiekou;

public interface A {
    int num =10;
    public void show();
    public default void method(){
        System.out.println("AAaAaAaAa");
    }
    public static void print(){
        System.out.println("Azzhong de print");
    }
}
