package IO流;

import java.io.*;

/**
 * @Author
 * @Date
 * 字节流：与字符流不同，字节流什么都可以直接读取和输出（一个字节一个字节读取）
 *
 */
public class FileOutputStreamTest01 {


    public static void main(String[] args) {

       FileInputStream fis = null;
       FileOutputStream fos =null;

        try {
            fis = new FileInputStream("C:\\Users\\86189\\Desktop\\1\\1.txt");
            fos = new FileOutputStream("C:\\Users\\86189\\Desktop\\1\\2.txt",true);
            //两个参数，第一个是文件的位置，第二个是是否追加写进去
            int i = 0;
            byte[] bytes = new byte[1024];
            //增加数组，让读取的速度更快
            while((i=fis.read(bytes))!=-1){
                fos.write(bytes,0,i);
            }
            fos.flush();
            fis.close();;fos.close();
            //读写完成后关闭io流
            //fis与fos的close的try catch最好分开写，这样报错了不会混淆
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
