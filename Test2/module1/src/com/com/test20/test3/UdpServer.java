package com.com.test20.test3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) {
        try {
            System.out.println("服务端~~~~~");
            //服务器端接收来自客户端的数据
            //创建服务器端的DatagramSocket，指定端口
            DatagramSocket socket = new DatagramSocket(8800);
            //创建数据报，用于接收客户端发送的信息
            byte[] data = new byte[1024];//创建字节数组，指定接收的数据包的大小
            DatagramPacket packet = new DatagramPacket(data, data.length);
            //接收客户端发送的数据
            socket.receive(packet); //接收到数据包之前会一直阻塞，会把数据存入packet的data
            //读取数据
            String info = new String(data, 0, packet.getLength());  //读取数据
            System.out.println("接收到客户端发来的信息:" + info);


            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
