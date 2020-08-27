package com.com.day04;

public class Task1_8 {
    public static void main(String[] args) {

        double d1 = swapTemperature("30C");
        System.out.println("摄氏度为:30.0°--华氏度w为:"+d1 +"°");
        double d2 = swapTemperature("86F");
        System.out.println("华氏度为:86.0°--摄氏度为:"+d2 +"°");

    }

    public static double swapTemperature(String s) {
        if (s.contains("C")) {
            String s1 = s.replace("C", " ");
            System.out.println(s1);
            String s2 =s1.trim();
            int a1 = Integer.parseInt(s2);
            return (9.0 / 5) * a1 + 32;
        } else {
            String s1 = s.replace("F", " ");
            System.out.println(s1);

            String s2 =s1.trim();
            int a1 = Integer.parseInt(s2);
            return (double) (a1 - 32) * 5 / 9.0;
        }

    }
}
