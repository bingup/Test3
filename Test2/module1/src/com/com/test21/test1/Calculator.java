package com.com.test21.test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculator {
    Calculator cal;
    @Test
    public void sum() {
        System.out.println("加法");
    }

    @Test
    public void sub() {
        System.out.println("减法");
    }

    @Test
    public void mul() {
        System.out.println("乘法");

    }

    @Test
    public void division() {
        System.out.println("除法");

    }

    @Before
    public void before() {
        System.out.println("在junit运行之前");
         cal = new Calculator();

    }

    @After
    public void after() {
        System.out.println("运行之后的");
        cal = null;
    }


}
