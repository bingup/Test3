package com.com.day11.test3;

import java.util.Calendar;

public class Test05 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + month+"月"+day+"日");
        c.add(Calendar.DAY_OF_MONTH,500);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH) + 1;

        System.out.println(year1 + "年" + month1+"月"+day1+"日");
    }
}
