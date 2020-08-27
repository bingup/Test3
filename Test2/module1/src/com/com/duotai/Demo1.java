package com.com.duotai;

public class Demo1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        showDog(dog);
        showCat(cat);
        showAnimal(dog);
        showAnimal(cat);

    }

    public static void showDog(Dog d) {
        d.eat();
    }

    public static void showCat(Cat c) {
        c.eat();
    }

    public static void showAnimal(Animal a) {
        a.eat();
    }
}
