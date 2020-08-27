package com.com.test20.test7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpFileServer {
    public static void main(String[] args) throws IOException {
        //文件上传
        //服务端接收数据后，写入到硬盘中
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("启动服务端!!!!!!");
        //用while true接收多个socket！
        while (true) {

            Socket server = ss.accept();
            new Thread(()->{
                try {
                //获取客户端的输入流对象
                    InputStream is = server.getInputStream();
                    //创建输出流，保存到本地的硬盘中,就保存到本项目把
                    FileOutputStream fos = new FileOutputStream(System.currentTimeMillis()+".jpg");
                    byte[] b = new byte[1024 * 8];
                    int len;
                    while ((len = is.read(b)) != -1) {
                        System.out.println(len);
                        fos.write(b, 0, len);
                        fos.flush();
                    }
                    fos.close();
//                    server.shutdownInput();
                    OutputStream  os = server.getOutputStream();
                    //回写
                os.write("上传成功".getBytes());
                    os.flush();
                os.close();
                //关闭资源


                server.close();
                System.out.println("文件上传保存成功");
            } catch(IOException e){
                e.printStackTrace();
                System.out.println("文件上传失败");
            }
            }).start();

        }
    }
}
