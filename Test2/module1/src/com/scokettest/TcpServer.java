package com.scokettest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) {
        System.out.println("服务端启动，等待连接。。。");
        try {
            ServerSocket ss= new ServerSocket(6666);
            Socket server = ss.accept();
            //通过socket获取输入流
            InputStream is = server.getInputStream();
            //一次性读取数据
            byte[] bytes = new byte[1024];
            int len =  is.read(bytes);
            String msg = new String(bytes,0,len);
            System.out.println(msg);
            //===============================================
            //回写数据需要用到outputStream
            OutputStream out = server.getOutputStream();
            out.write("我很好，谢谢你~".getBytes());
            //关闭所有的资源
            out.close();
            is.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
