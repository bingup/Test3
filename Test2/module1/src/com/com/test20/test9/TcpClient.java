package com.com.test20.test9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            InputStream is = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream("2.png");
            byte[] bytes = new byte[1024];
            int len;
            while ((len =is.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
            fos.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
