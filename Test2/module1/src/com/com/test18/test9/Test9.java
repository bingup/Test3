package com.com.test18.test9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("c:\\stu.txt");
        while (true) {
            System.out.println("请按照以下格式输入学生信息：学号-学生名字");
            String s = sc.nextLine();
            if (s.equals("end")){
                break;
            }
            fw.write(s);
            String s1 = "\r\n";
            fw.write(s1);
        }
        fw.close();

    }
}
