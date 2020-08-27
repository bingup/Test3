package com.com.day05;

import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {

        System.out.println(year + "年" + month + "月" + day + "日");

    }

    public void isBi() {
        int y1 = this.getYear();
        if ((y1 % 4 == 0 && y1 % 100 != 0)||(y1 % 400 == 0)){
            System.out.println(y1 + "年是闰年");
        }else
        {
            System.out.println(y1 + "年不是闰年");

        }


    }

}

