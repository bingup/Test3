package com.com.day011.test3;

import java.util.ArrayList;

public class FilterTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            User useri = new User();
            useri.setId(i);
            list.add(useri);
        }

        System.out.println("未分组");
        System.out.println(list);
        JieDaiYuan j1 = new JieDaiYuan();
        JieDaiYuan j2 = new JieDaiYuan();
        JieDaiYuan j3 = new JieDaiYuan();
        j3.jieDai(0, 49, list, "A");
        j1.jieDai(10, 19, list, "v1");
        j1.jieDai(20, 29, list, "v2");
        int count = 0;
        System.out.println("已分组");
        for (User u : list) {
            if (u.getId() %9 !=0) {
                System.out.print(u);

            }else {
                System.out.print(u);
                System.out.println();

            }

        }
    }
}
