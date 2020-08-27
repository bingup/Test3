package com.JunitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test01 {
    //方法命名规则，使用驼峰命名法
    //方法声明上，必须使用注解，@Test
    @Before
    public void show() {
        System.out.println("测试成功");
    }

    @Test
    public void method() {

        System.out.println("qiuqiunile");
    }

    @After
    public void shou2() {
        System.out.println("gg");
    }
}
