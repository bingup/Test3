package com.scokettest;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1 {
    //Tcp简单的程序实现
    //服务器端
    public static void main(String[] args) throws IOException {
        System.out.println("服务器端启动了，等待连接");
        ServerSocket ss = new ServerSocket(8355);
        Socket cilent = ss.accept();
        //获取输入流，即从客户端读取到的数据
        InputStream is = cilent.getInputStream();
        //创建字符数组，一次性的读取数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String msg = new String(bytes,0,len);
        System.out.println(msg);
        is.close();
        cilent.close();
    }

}
