package com.scokettest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //客户端
        //socker(IP，port）一个是ip地址，第二个是端口号
        System.out.println("客户端，发送数据");
        Socket socket  = new Socket("localhost",8355);

        //客户端的输出流 是往服务端写数据的
        OutputStream os = socket.getOutputStream();
        os.write("我来了111111111111111111111111".getBytes());

        os.close();
        socket.close();
    }
}
