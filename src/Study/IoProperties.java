package Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author
 * @Date
 */
public class IoProperties {
    public static void main(String[] args) {
        try {
            //获取文件输入流
            FileReader fis = new FileReader("C:\\Users\\86189\\Desktop\\1\\10.txt");
            Properties p = new Properties();
            //通过properties来输出文本里面的内容
            p.load(fis);
            String username = p.getProperty("user");
            //用这个方法来获取文本中等号左边的为user的右边的值
            System.out.println(username);
            String password = p.getProperty("password");
            //同理
            System.out.println(password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
