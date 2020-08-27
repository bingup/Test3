package com.com.day05;

public class CoderTest {
    public static void main(String[] args) {
        Coder coder = new Coder("kobe",0025,10000);
        Manager manager = new Manager("james",9527,15000,3000);
        manager.intro();
        manager.showSlary();
        manager.work();
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
