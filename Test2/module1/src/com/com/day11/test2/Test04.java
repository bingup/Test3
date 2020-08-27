package com.com.day11.test2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws ParseException {
        String s1 = "1992-10-20";

        DateFormat d2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = d2.parse(s1);
        System.out.println(date1);
    }
}
