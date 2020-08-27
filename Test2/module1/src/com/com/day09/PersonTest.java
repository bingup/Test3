package com.com.day09;

public class PersonTest {
    public static void main(String[] args) {
        Coder coder = new Coder("马化腾",10);
        Teacher teacher = new Teacher("马云",20);
        coder.eat();
        coder.sleep();
        coder.code();
        teacher.eat();
        teacher.sleep();
        teacher.shangke();
    }
}
