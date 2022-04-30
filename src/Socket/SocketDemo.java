package Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author
 * @Date
 */
public class SocketDemo {

    {
        try {
        //创建一个ServerSocket对象，并设置端口号为8888
        ServerSocket ss = new ServerSocket(8888);
        //死循环
        while(true) {
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);



            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       // } catch (IOException e) {
         //   e.printStackTrace();
        }
    }

