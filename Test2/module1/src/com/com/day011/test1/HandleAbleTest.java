package com.com.day011.test1;

public class HandleAbleTest {
    public static void main(String[] args) {

        HandleAble able  = new HandleAble() {
            @Override
            public void HandleString(String num) {
                System.out.println("原数字"+num);
                String[] nums = num.split("\\.");
                System.out.println("取整后"+nums[0]);
                double d= Double.parseDouble(num);

                System.out.println("保留4位小数后："+String.format("%.4f",d));
            }
        };
        able.HandleString("23.23456789");
    }
}
