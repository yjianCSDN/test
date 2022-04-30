package IO流;

import java.io.*;
import java.util.Scanner;

/**
 * @Author
 * @Date
 */
public class TestCharStream {
    public static void main(String[] args) throws IOException {
//        try {
//            File f = new File("C:\\Users\\86189\\Desktop\\1\\2.txt");
//            f.createNewFile();
//            FileReader fr = new FileReader("C:\\Users\\86189\\Desktop\\1\\1.txt");
//            FileWriter fw = new FileWriter(f);
//            byte[] b = new byte[1024];
//            //read(byte[] b,int off,int len)方法，将输入流中最多 len 个数据字节读入 byte 数组。尝试读取len 个字节，
//            // 但读取的字节也可能小于该值。以整数形式返回实际读取的字节数。
//            int i = 0;
//            while((i = fr.read(b))!=-1){
//                fw.write(i);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }finally {
//           // if(fsw!=null){
//             //   fw.close()
//            }
        //1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\86189\\Desktop\\1\\1.txt");

        //2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("C:\\Users\\86189\\Desktop\\1\\2.txt");

        byte[] bytes = new byte[1024];
        int len = 0;
        //3.使用字节输入流对象中的方法read读取文件
        while((len = fis.read(bytes))!=-1){
            //4.使用字节输出流的中的方法write,把读取到的字节写入到目的地的文件中
            fos.write(bytes,0,len);
        }
        //4.释放资源(先关闭字节输出流资源,在关闭字节输入流资源-->文件写入完毕,说明已经读取完毕)
        fos.close();
        fis.close();
    }
}




