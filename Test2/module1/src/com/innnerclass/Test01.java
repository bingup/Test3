package com.innnerclass;

import java.util.ArrayList;
import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
//        Body.heart h = new Body().new heart();
//        h.jump();
//
//
//            invokeCook(() ->{
//                System.out.println("chshi");
//            });
//
//        Person[] array ={
//                new Person("啊啊",18),
//                new Person("aa",188),
//                new Person("nma",20)};
//        Arrays.sort(array,(Person a,Person b) ->{
//            return a.getAge() -b.getAge();
//        });
//
//        for (Person person:array){
//            System.out.println(person);
//        }
//        invokeCalc(120,130,(int a,int b)->{
//            return a+b;
//        });
        //lambda表达式

    }
    private static void invokeCook(Cook cook){

        cook.makeFood();
    }

    public  static void invokeCalc(int a,int b,Cal cal){
        int result  =cal.cal(a,b);
        System.out.println(result);
    }
}
