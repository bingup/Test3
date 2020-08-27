package com.com.day09;



public class EmpTest {
    public static void main(String[] args) {
        Manger manager = new Manger("m110","老王",10000);
        manager.eat();
        manager.work();

        Cook cook = new Cook("c110","小王",6000);
        cook.eat();
        cook.work();
    }
}
