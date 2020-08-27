package com.com.day14.test12;

import java.util.HashMap;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if ((chs[i ]> 'a' && chs[i ]< 'z') || (chs[i] > 'A' && chs[i] < 'Z')) {
                countingKey(map, "字母");
            } else if (chs[i] == ' '){
                countingKey(map, "空格");
            } else if(chs[i] >'0'&&chs[i]<'9'){
                countingKey(map, "数字");
            } else {
                countingKey(map, "其他");
            }
        }
        System.out.println(map);


    }

    public static void countingKey(HashMap map, String key) {
        if (map.containsKey(key)) {
            int i = (int) map.get(key)+1;
            map.put(key, i);
        } else {
            map.put(key, 1);
        }

    }
}
