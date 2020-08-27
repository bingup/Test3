package com.scokettest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpFileClient {
    //文件上传中  客户端需要做到的从本地硬盘中读取文件，然后输出到服务端中
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            FileInputStream fis = new FileInputStream("c:\\c.png");
            OutputStream os = socket.getOutputStream();
            byte[] b = new byte[8 * 1024];
            int len;
            while ((len = fis.read(b))!= -1) {
                os.write(b,0,len);
                os.flush();
            }
            System.out.println("文件发送完毕" );
            //shifangziyuan

            os.close();
            fis.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
