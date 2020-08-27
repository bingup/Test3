package com.com.day16.test7;

public class Test7 {
    public static void main(String[] args) {
        //130-120
        invokeCalc(130,120,(int a,int b)->{
            return a-b;
        });

        invokeCalc(130,120,(a,b)->a-b);
    }

    public static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是: " + result);
    }
}
