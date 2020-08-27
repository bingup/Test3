package com.com.day13.test13;

import java.util.HashSet;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        while(true){
            System.out.println("请输入数字:");
            int a = sc.nextInt();
            if(a == -1)
            {
                break;
            }
            set.add(a);
        }
        for (int b : set){
            sum += b;
        }
        System.out.println("求和的值为："+sum);
        double d = sum/set.size();
        System.out.println("平均值为："+d);

    }
}
