package com.com.test20.test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket socket = ss.accept();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));
            byte[] bytes = new byte[1024];
            String s = null;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                System.out.println(s);
                bw.newLine();
                bw.flush();

            }
            System.out.println("数据回送完毕");
            bw.close();
            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
