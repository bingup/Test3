package com.com.test19.test4;

import java.io.*;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data.txt"));
//        int i = 0;
//        Scanner sc = new Scanner(System.in);
//        while (i < 3) {
//            System.out.println("请输入字符串验证码");
//            String s= sc.nextLine();
//            bos.write(s.getBytes());
//            bos.write("/r/n".getBytes());
//        }
//        bos.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 3) {
            System.out.println("请输入字符串验证码");
            String s = sc.nextLine();
            bw.write(s);
            bw.newLine();
            i++;
        }
        bw.close();
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        System.out.println("请输入要被验证的字符串验证码");
        String s1 = sc.nextLine();
        String line;
        boolean b= false;
        while ((line = reader.readLine()) != null){
            if(s1.equals(line)){
                System.out.println("验证成功");
                b =true;
            }
        }
        reader.close();
        if (b ==false){
            System.out.println("验证失败");
        }

    }
}
