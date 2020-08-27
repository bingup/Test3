package com.com.test20.test7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpFileClient {
    public static void main(String[] args) throws IOException {
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
            socket.shutdownOutput();
            fis.close();

            InputStream is = socket.getInputStream();

            int len1;
            byte[] bytes = new byte[1024];
            while((len1 = is.read(bytes))!=-1) {
                System.out.println(new String(bytes, 0, len1));
            }

            is.close();
            System.out.println("文件发送完毕" );
            //shifangziyuan

            os.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
