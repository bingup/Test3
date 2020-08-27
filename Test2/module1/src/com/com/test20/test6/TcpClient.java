package com.com.test20.test6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 6666);
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(client.getOutputStream()));
        byte[] bytes = new byte[1024];
        String s = null;
        while (true) {
            System.out.println("请输入要发送的信息");
            s = sc.nextLine();

            if (s.equals("exit")) {
                break;
            }
            bw.write(s);
            bw.newLine();
            bw.flush();
            String line;
                System.out.println(br.readLine());

        }

        bw.close();
        br.close();
        client.close();
    }
}
