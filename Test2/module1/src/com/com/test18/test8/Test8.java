package com.com.test18.test8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("C:\\info.txt");

        while (true) {
            System.out.println("请输入一条信息");
            String  s = sc.nextLine();
            if (s.equals("886")){
                break;
            }
            fw.write(s);
            fw.flush();
        }
        fw.close();
    }
}
