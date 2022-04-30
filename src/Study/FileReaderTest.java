package Study;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author
 * @Date
 *文件字符输出流，只能读取文本（word格式的都不能被读取，因为word是富文本，txt这种是纯文本）
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\86189\\Desktop\\1\\2.txt");
            char []chars = new char[4];//一次读取4个字节
                fr.read(chars);
                for (char c:chars){
                    //一次读取一个字符
                    System.out.println(c);
                }

//            int i =0;
//            while ((i=fr.read(chars))!=-1){
//                System.out.println(new String(chars,0,i));
//            }
//            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
