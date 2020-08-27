package com.com.day17.test11;

public class Test11 {
    public static void main(String[] args) {
        System.out.println(mul(10));
    }
    public static int mul(int num){
        if(num == 1)
            return  1;
        return num*mul(num-1);

    }
}
