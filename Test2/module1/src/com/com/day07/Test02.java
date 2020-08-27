package com.com.day07;

import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        Random random =new Random();
        for (int i = 0; i <5 ; i++) {
            System.out.println(random.nextInt(10)+1);
        }

    }
}
