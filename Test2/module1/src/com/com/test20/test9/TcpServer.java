package com.com.test20.test9;

import com.sun.security.ntlm.Server;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) {

        try {
            System.out.println("服务端~~~开启！！！！");
            ServerSocket ss = new ServerSocket(6666);
            while (true) {
                //接收客户端
                Socket socket = ss.accept();
                OutputStream os = socket.getOutputStream();
                FileInputStream fis = new FileInputStream("1.png");
                byte[] b = new byte[1024];
                int len;
                while ((len = fis.read(b)) != -1) {
                    os.write(b,0,len);
                }

                fis.close();
                os.close();
                socket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
