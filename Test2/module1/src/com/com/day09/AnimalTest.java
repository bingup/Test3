package com.com.day09;

public class AnimalTest {
    public static void main(String[] args) {
        Dog  dog = new Dog();
        Cat  cat = new Cat();
        dog.setColor("red");
        dog.setName("旺财");
        dog.setPrice(20.0);
        cat.setColor("red");
        cat.setName("波斯猫");
        cat.setPrice(20.0);
        dog.eat();
        dog.look();
        System.out.println("---------");
        cat.eat();
        cat.catchMouse();
    }
}
