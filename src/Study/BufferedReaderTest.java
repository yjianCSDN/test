package Study;

import java.io.*;

/**
 * @Author
 * @Date
 * 缓冲流
 *
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\86189\\Desktop\\1\\2.txt");
            //通过字节流转换为（InputStreamReader将字节流转化为字符流）
            //fis是字节流，isr是字符流
            InputStreamReader isr = new InputStreamReader(fis);

            //这个构造方法只能传一个字节流
            br = new BufferedReader(isr);
            String i =null;
            while((i=br.readLine())!=null){
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
