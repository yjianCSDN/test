package DownLoad;

import java.io.*;
import java.net.*;

/**
 * @Author
 * @Date
 */
public class Test {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("47.93.33.137",6000);

            InputStream is=socket.getInputStream();
            BufferedInputStream in=new BufferedInputStream(is);

            FileOutputStream fos = new FileOutputStream("C:\\Users\\86189\\Desktop\\1\\蓝桥999.xlsx");
            byte buff[] = new byte[1024];
            int a = 0;
            while ((a = in.read(buff)) != -1) {
                fos.write(buff, 0, a);
            }
            fos.flush();
            in.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
