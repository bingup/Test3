package com.com.day09;

public class duckTest {
    public static void main(String[] args) {
        duke duke1 = new duke(1,"黑色");
        Chicken chicken = new Chicken(2,"红色");
        duke1.eat();
        duke1.swim();
        chicken.eat();
        chicken.work();
    }
}
