package com.com.test20.test8;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 8888);
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(client.getOutputStream()));

        String s = null;
            System.out.println("请输入要发送的用户名和密码:格式 jack=1234");
            s = sc.nextLine();

            bw.write(s);
            bw.newLine();
            bw.flush();
            String line;
            System.out.println(br.readLine());



        bw.close();
        br.close();
        client.close();


    }

    public static void xie() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        bw.write("jack=1234");
        bw.newLine();
        bw.flush();
        bw.write("top=1111");
        bw.newLine();
        bw.flush();
        bw.close();


    }
}
