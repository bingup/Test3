package com.com.day03;

public class Test06 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int num1=100;num1<1000;num1++){
            a = num1/100;
            b = num1/10%10;
            c = num1%10;
            if (num1 == (a*a*a +b*b*b+c*c*c)){
                System.out.println(num1);
            }
        }
    }
}
