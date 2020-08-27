package com.com.day17.test10;

public class Test10 {
    public static void main(String[] args) {
        int a = sum(100);
        System.out.println(a);
    }

    public static  int sum(int num){
        if(num==0)
            return  0;
        return  num+sum(num-1);

    }
}
