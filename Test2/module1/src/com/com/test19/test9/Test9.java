package com.com.test19.test9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一行字符串");
        String s = sc.nextLine();

        try {
            PrintStream ps = new PrintStream("d.txt");
            System.setOut(ps);
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
