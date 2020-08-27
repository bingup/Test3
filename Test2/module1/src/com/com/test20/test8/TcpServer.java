package com.com.test20.test8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("服务端！！！！");
        while (true) {
            Socket server = ss.accept();

            InputStream is = server.getInputStream();
            BufferedReader br1 = new BufferedReader(
                    new InputStreamReader(is));
            //传进来的格式
            String s = br1.readLine();
            String[] strs1 = s.split("=");
            String name = strs1[0];
            String pwd = strs1[1];
            BufferedReader br2 = new BufferedReader(new FileReader("data.txt"));
            OutputStream os = server.getOutputStream();
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(os));
            String line;
            boolean b = true;
            while ((line = br2.readLine()) != null) {
                String[] strs2 = line.split("=");
                if (strs2[0].equals(name)) {
                    if (strs2[1].equals(pwd)) {
                        bw.write("登录成功");
                        bw.newLine();
                        bw.flush();
                        System.out.println("注册成功");
                        //关闭资源
                        b = false;
                        break;
                    } else {
                        bw.write("密码错误");
                        bw.newLine();
                        bw.flush();
                        //关闭资源
                        b = false;
                        break;
                    }
                }
            }
            os.close();
            br2.close();
            br1.close();
            is.close();
            bw.close();
            server.close();

            if (b == true) {
                BufferedWriter bw1 = new BufferedWriter(new FileWriter("data.txt", true));
                bw1.write(name + "=" + pwd);
                bw1.newLine();
                bw1.flush();
                bw.write("注册成功");
                bw.newLine();
                bw.flush();
                System.out.println("注册成功");
                bw.close();
                bw1.close();
                os.close();
                br2.close();
                br1.close();
                is.close();
                server.close();
            }


        }
    }
}
