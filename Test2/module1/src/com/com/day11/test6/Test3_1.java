package com.com.day11.test6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test3_1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-4);
        calendar.set(Calendar.MONTH,11);
        calendar.set(Calendar.DAY_OF_MONTH,18);
        Date now = calendar.getTime();
        DateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(d1.format(now));
        ((SimpleDateFormat) d1).applyPattern("yyyy年MM月dd日");
        System.out.println(d1.format(now));

    }
}
