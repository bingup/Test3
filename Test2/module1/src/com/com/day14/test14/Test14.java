package com.com.day14.test14;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test14 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                int a = (int) map.get(strings[i]) + 1;
                map.put(strings[i], a);
            } else {
                map.put(strings[i], 1);
            }
        }

        Set<String> keys = map.keySet();
        for (String key : keys){
            int value = map.get(key);
            System.out.println(key+"="+value);
        }

    }
}
