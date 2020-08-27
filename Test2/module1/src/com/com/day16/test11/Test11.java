package com.com.day16.test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Test11 {
    static int number1 = 0;
    static int num1 = 0;

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        int number2 = 0;
        ReentrantLock lock = new ReentrantLock();
         Collections.shuffle(list);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (list.size() > 0) {

                        Integer number = list.remove();

                        if (num1 + number1 == 100) {
                            break;
                        }
                        String dcbu = DoubleColorBallUtil.create();
                        System.out.println("编号为：" + number + " 的员工从" + Thread.currentThread().getName() + "入场！" +
                                "拿到的双色球彩票号码是:" + dcbu);
                        number1++;
                    } else {
                        break;
                    }
                    lock.unlock();
                }
                System.out.println("从前门入场的员工总共: " + number1 + "位员工");
                System.out.println("从后门入场的员工总共: " + num1 + "位员工");

            }
        }, "前门");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (list.size() > 0){


                        Integer number = list.remove();

                    if (num1 + number1 == 100) {
                        break;
                    }
                    String dcbu = DoubleColorBallUtil.create();
                    System.out.println("编号为：" + number + " 的员工从" + Thread.currentThread().getName() + "入场！" +
                            "拿到的双色球彩票号码是:" + dcbu);

                    num1++;
                    }else{
                        break;
                    }

                    lock.unlock();
                }
                System.out.println("从前门入场的员工总共: " + number1 + "位员工");
                System.out.println("从后门入场的员工总共: " + num1 + "位员工");
            }
        }, "后门");

        t1.start();
        t2.start();

    }
}
