package com.com.day10.test7;

import com.com.day10.test7.Emoloyee;
import com.com.day10.test7.Money;

public class Company implements Money {

    public double all;
    @Override
    public void playSalary(Emoloyee emp) {
        double all11 = all-emp.salary;
        this.all = all11;
        System.out.println("给"+emp.name+"发工资"+emp.salary+"元,公司剩余："+all11 );
    }
}
