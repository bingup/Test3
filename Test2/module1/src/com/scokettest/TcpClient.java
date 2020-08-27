package com.scokettest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) {
        System.out.println("客户端 发送数据");
        try {
            Socket client = new Socket("localhost",6666);
            //获取outputStream对象来向服务端写入数据~
            OutputStream os = client.getOutputStream();
            os.write("你好，我是客户端的发送信息！".getBytes());
            //===========================================
            //接收服务端发过来的信息哦!
            InputStream is = client.getInputStream();
            byte[] b= new byte[1024];
            int len = is.read(b);
            System.out.println(new String(b,0,len));

            //关闭资源
            is.close();
            os.close();
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
