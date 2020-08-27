package com.com.day14.test20;

import java.util.HashMap;
import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("12345678", "西瓜");
        map.put("74185223", "苹果");
        map.put("12341342", "香蕉");
        map.put("12341234", "橘子");
        System.out.println("根据商品号查询对应的商品.");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (map.containsKey(s)) {
            System.out.println("根据商品号:"+s+",查询到对应的商品为:"+map.get(s));
        } else {
            System.out.println("查无此商品");
        }
    }
}
