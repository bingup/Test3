package com.com.test20.test4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        Socket client = new Socket("localhost",8888);

        OutputStream os = client.getOutputStream();
        os.write("客户端传了~".getBytes());

        os.close();
        client.close();
    }
}
