package 内网穿透;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author
 * @Date
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(8888);
            System.out.println("等待客户端连接");
            Socket socket = ss.accept();
            System.out.println("连接成功");

            ServerSendMassageThread ssmt = new ServerSendMassageThread(socket);
            ssmt.start();
            ServerPostMassageThread spmt = new ServerPostMassageThread(socket);
            spmt.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

     static class ServerSendMassageThread extends Thread{
        Socket socket;
        public ServerSendMassageThread(Socket socket){
         this.socket = socket;
        }
        public void run(){
            try {
                Scanner sc = new Scanner(System.in);
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                for(;;){
                    System.out.println("请输入消息");
                    String msg = sc.next();
                    PrintWriter out = new PrintWriter(osw);
                    out.println(msg);
                    out.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    static class ServerPostMassageThread extends Thread{
        Socket socket;
        public ServerPostMassageThread(Socket socket){
            this.socket = socket;
        }

        public void run(){
            try {
                for (;;) {
                    InputStream is = socket.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);
                    String message = br.readLine();
                    System.out.println("客户端说:" + message);
                }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

