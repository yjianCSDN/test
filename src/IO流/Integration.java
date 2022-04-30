package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date
 */
public class Integration {
    public static void main(String[] args) throws IOException {

            String file[] = {"C:\\Users\\86189\\Desktop\\1\\1.txt","C:\\Users\\86189\\Desktop\\1\\2.txt"};
            FileOutputStream fos = new FileOutputStream("C:\\Users\\86189\\Desktop\\1\\6.txt");
            int a = 0;
            byte[] bytes = new byte[1024];
            for(int i = 0; i<file.length;i++){
                FileInputStream fis = new FileInputStream(file[i]);
                while ((a = fis.read(bytes))!=-1){
                    fos.write(bytes,0,a);//write(byte[] b, int off, int len)


                }
            }


    }
}
