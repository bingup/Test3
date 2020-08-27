package com.day011;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApi {
    public static void main(String[] args) throws Exception {
//        System.out.println(new Date());
//        System.out.println(new Date(0L));
//        Date date =new Date();
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        String str =df.format(date);
//        System.out.println(str);
//        try{
//            Date d1=df.parse(str);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }finally {
//            System.out.println();
//        }
        Date nowDate = new Date();
        long a = nowDate.getTime();
        String str = "1990年6月1日";
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date myDate = df.parse(str);
        long b = myDate.getTime();
        long c = a - b;
        //毫秒值转换成date，在dateformat转换成String

        System.out.println(c / 1000 / 60 / 60 / 24);

    }
}
