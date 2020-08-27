package com.com.day08;

public class Test08 {
    public static void main(String[] args) {
        String a = "javajﬁewjavajﬁowfjavagkljjava";
        int b = getCount(a,"java");
        System.out.println("javajﬁewjavajﬁowfjavagkljjavjava字符串的数量:"+b);

    }

    public static int getCount(String str, String ch) {
        int count = 0;
        while (str.indexOf(ch) != -1) {
            int  b = str.indexOf(ch);
            str = str.substring(b+ch.length());
            count++;
        }
       return count;
    }
}
