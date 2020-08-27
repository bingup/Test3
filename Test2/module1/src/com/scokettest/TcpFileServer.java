package com.scokettest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpFileServer {
    public static void main(String[] args) {
        //文件上传
        //服务端接收数据后，写入到硬盘中
        System.out.println("启动服务端!!!!!!");
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket server = ss.accept();
            //获取客户端的输入流对象
            InputStream is = server.getInputStream();
            //创建输出流，保存到本地的硬盘中,就保存到本项目把
            FileOutputStream fos = new FileOutputStream("1.png");
            byte[] b= new byte[1024*8];
            int len;
            while((len = is.read(b))!=-1){
                fos.write(b,0,len);
            }
            //关闭资源
            fos.close();
            is.close();
            server.close();
            System.out.println("文件上传保存成功");
         } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
