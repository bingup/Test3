package com.com.day12.test7;

import com.com.day12.test7.InterImpl1;
import com.com.day12.test7.InterImpl2;

public class Test7_1 {
    public static void main(String[] args) {
        InterImpl1 s1 =new InterImpl1();
        s1.show("string");
        InterImpl2<Integer> s2 = new InterImpl2<Integer>();
        s2.show(123);
    }
}
