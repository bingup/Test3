package com.com.day13.test16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Test14 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        //红色球
        Random random = new Random();
        while (list.size()<=6){
            list.add(random.nextInt(33)+1);
        }
        for (int i  :list)
            list1.add(i);

        list1.add(random.nextInt(16)+1);
        System.out.println(list1);
    }
}
