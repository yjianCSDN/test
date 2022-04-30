package IO流;

import java.io.*;

/**
 * @Author
 * @Date
 */
public class text {
    public static void main(String[] args) throws IOException {
//        File file = new File("");
//        FileWriter fw = new FileWriter("C:\\Users\\86189\\Desktop\\1\\1.txt");
//        fw.write(123);
//        fw.flush();
//        fw.close();
//       String[] file = {"C:\\Users\\86189\\Desktop\\1\\1.mp3","C:\\Users\\86189\\Desktop\\1\\2.mp3"};
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\86189\\Desktop\\1\\4.mp3");
//        for(int i=0;i<file.length;i++){
//            FileInputStream fis = new FileInputStream(file[i]);
//            byte speed[] = new byte[2048];
//            int a =0;
//            while ((a=fis.read(speed))!=-1){
//                fos.write(speed,0,a);
//            }fis.close();
//        }


        String file[] ={"C:\\Users\\86189\\Desktop\\1\\1.mp3","C:\\Users\\86189\\Desktop\\1\\2.mp3","C:\\Users\\86189\\Desktop\\1\\3.mp3"};
        FileOutputStream fos = new FileOutputStream("C:\\Users\\86189\\Desktop\\1\\6.mp3");
        for(int i =0;i<file.length;i++){
            FileInputStream fis = new FileInputStream(file[i]);
            byte []speed = new byte[1024];//加快线程读取进度
            int a=0;
            while ((a=fis.read(speed))!=-1){
                fos.write(speed,0,a);
            }fis.close();
        }
    }
}
