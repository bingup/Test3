package com.com.day03;

public class Test01 {
    public static void main(String[] args) {
        int score = 60;

        if (score < 0 || score > 100) {
            System.out.println("成绩有误");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("里昂");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

 }
}
