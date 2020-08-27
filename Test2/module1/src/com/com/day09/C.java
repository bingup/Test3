package com.com.day09;

public class C extends B {
    int numc = 30;

    @Override
    public void showb() {
        System.out.println("B类中的numb:"+numb);
    }

    public void showC(){
        System.out.println("C类中的numb:"+numc);
    }
}
