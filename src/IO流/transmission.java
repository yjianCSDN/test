package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date
 */
public class transmission {
    public static FileInputStream fis;
    public static FileOutputStream fos;
    public static void main(String[] args) throws IOException {

        try {
            File f = new File("C:\\Users\\86189\\Desktop\\1\\2.txt");
            f.createNewFile();
            fis = new FileInputStream("C:\\Users\\86189\\Desktop\\1\\1.txt");
            fos = new FileOutputStream(f);
            int i = 0;
            if((i = fis.read())!=-1){

                fos.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                fis.close();
            }
            if(fos!=null){
                fos.close();
            }
        }
    }
}
