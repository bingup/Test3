package com.com.day14.test15;

import java.util.*;

public class Test15 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while (map.size() < 5) {
            String s = sc.nextLine();
            int randomNum = random.nextInt(100);
            map.put(s, randomNum);
        }
        Iterator<String> it = map.keySet().iterator();
        String s = it.next();
        int max = map.get(s);
        int min = map.get(s);
        int sum = 0;
        int avg = 0;
        Set<String> set = map.keySet();
        for (String key : set) {
            int value = map.get(key);
            if (value > max)
                max = value;
            if (value < min)
                min = value;
            sum +=value;
        }
        avg = sum/(map.size());
        System.out.println("总分为:"+sum);
        System.out.println("最高分为:"+max);
        System.out.println("最低分为:"+min);
        System.out.println("平均分为:"+avg);
    }
}
