package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date
 */
public class 整合 {
    public static void main(String[] args) throws IOException {
        String file[] ={"C:\\Users\\86189\\Desktop\\1\\1.mp3","C:\\Users\\86189\\Desktop\\1\\2.mp3"};
        FileOutputStream fos = new FileOutputStream("C:\\Users\\86189\\Desktop\\1\\1.txt");
            for(int i=0;i<file.length;i++){
                FileInputStream fis = new FileInputStream(file[i]);
                byte buff[] =new byte[2048];
                int a =0;
                while((a=fis.read(buff))!=-1){
                    fos.write(buff,0,a);
                }
            fos.close();
            }

    }
}
