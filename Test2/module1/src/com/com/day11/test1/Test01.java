package com.com.day11.test1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = d.format(date);
        System.out.println(s);



    }
}
