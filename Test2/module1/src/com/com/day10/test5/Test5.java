package com.com.day10.test5;

public class Test5 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.eat();
        dog.eat();
        if(dog instanceof Dog){
            Dog A = (Dog)dog;
           A.lookHome();
        }

        if (cat instanceof Cat){
            Cat B = (Cat)cat;
           B.catchMouse();
        }
    }
}
