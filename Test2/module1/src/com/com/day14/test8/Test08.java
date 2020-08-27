package com.com.day14.test8;

import java.util.HashMap;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        Scanner sc=  new Scanner(System.in);

        while(map.size()<5){
            System.out.println("录入格式为:”姓名,年龄:");
            String s = sc.nextLine();
            String[] strings = s.split(",");
            map.put(strings[0],strings[1]);
        }
        System.out.println(map);
    }
}

