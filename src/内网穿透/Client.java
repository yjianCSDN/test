package 内网穿透;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author
 * @Date
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("47.93.33.137", 6000);
            ClientPostMassageThread cpmt = new ClientPostMassageThread(socket);
            cpmt.start();

            ClientSendMessageThread csmt = new ClientSendMessageThread(socket);
            csmt.start();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        }
     class ClientSendMessageThread extends Thread{
        Socket socket;
        public ClientSendMessageThread(Socket socket){
            this.socket = socket;
        }
        public void run(){
            try {
                Scanner sc = new Scanner(System.in);
                OutputStream os= socket.getOutputStream() ;
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
     class ClientPostMassageThread extends Thread{
        Socket socket;
        public ClientPostMassageThread(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                OutputStream os = null;
                os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);


                for (;;) {
                    InputStream is = socket.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);
                    String message = br.readLine();
                    System.out.println("服务器说：" + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


