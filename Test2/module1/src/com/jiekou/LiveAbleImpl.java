package com.jiekou;

public class LiveAbleImpl implements LiveAble {
    @Override
    public void eat() {
        System.out.println("shagouchidongle ");
    }

    @Override
    public void sleep() {
        System.out.println("shagou shuijiao le ");
    }

    public static void main(String[] args) {
        C c1 = new C();
        c1.show();
        c1.method();


    }
}
