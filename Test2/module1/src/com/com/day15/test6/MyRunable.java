package com.com.day15.test6;

public class MyRunable implements Runnable {
    private static int num = 100;
    private static int number = 1;
    private static int number1 = 0;
    private static int number2 = 1;
    //这个怎么来统计呢？

    @Override
    public void run() {
        while (true) {
            synchronized (Object.class) {
                if (num <= 0) {
                    break;
                }

                System.out.println(Thread.currentThread().getName() + "卖出第" + (number++) + "个" +

                        "总共剩" + (--num) + "个");
                if(Thread.currentThread().getName().equals("官网")){
                    number1++;
                }
                if(Thread.currentThread().getName().equals("实体店")){
                    number2++;
                }

            }
        }
        if(Thread.currentThread().getName().equals("官网")){
            System.out.println(number1+"官网");
        }
        if(Thread.currentThread().getName().equals("实体店")){

            System.out.println(number2);
        }



    }
}
