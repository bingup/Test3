package com.com.day14.test11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test11 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (map.containsKey(chs[i])) {
                Integer num = map.get(chs[i]) + 1;

                map.put(chs[i], num);
            } else {
                map.put(chs[i], 1);
            }
        }
        StringBuilder s1 = new StringBuilder();
        Set<Character> keys = map.keySet();
        for (char ch : keys){
            s1.append(ch+"("+map.get(ch)+")");
        }
        System.out.println(s1);

    }
}
