package com.cucci.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Author: shenyw@citycloud.com.cn
 * @Description:
 * @Date: 2020/6/14 20:41
 * @Version: 1.0
 */
public class GreetClient {

    public void start(String ip, int port) throws IOException {
        Socket clientSocket = new Socket(ip, port);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out.println("hello server");
        System.out.println(in.readLine());
    }

    public static void main(String[] args) throws IOException {
        GreetClient client = new GreetClient();
        client.start("127.0.0.1", 6666);
    }
}
