package com.com.day11.test4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2_1 {
    public static void main(String[] args) throws ParseException {
        String s1 = "1998-06-01";
        DateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = d1.parse(s1);
        long long1 = date.getTime();
        long long2 = System.currentTimeMillis();
        long long3 = long2 - long1;
        System.out.println("我活了"+long3/1000/60/60/24+"天");
    }
}
