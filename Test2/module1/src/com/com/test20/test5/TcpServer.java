package com.com.test20.test5;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端~~");
        ServerSocket ss = new ServerSocket(8888);
        //接收客户端的socket对象
        Socket socket = ss.accept();
        //获取传来的内容然后输出
        InputStream is = socket.getInputStream();

        byte[] b = new byte[1024];
        int len =is.read(b);
        String msg = new String(b,0,len);
        System.out.println(msg);

        is.close();
        socket.close();


    }
}
