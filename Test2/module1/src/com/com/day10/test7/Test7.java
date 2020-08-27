package com.com.day10.test7;

public class Test7 {
    public static void main(String[] args) {
        Company company = new Company();
        Manger manger = new Manger();
        Coder coder = new Coder();
        company.all = 1000000.0;
        manger.name ="李小亮";
        manger.salary = 9000.0;
        coder.name = "张小强";
        coder.salary=5000.0;
        company.playSalary(manger);
        company.playSalary(coder);
    }
}
