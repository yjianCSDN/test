package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author
 * @Date
 */
public class IopropertiesTest1 {
    public static void main(String[] args) throws IOException {
//        try {
            //currentThread当前线程对象
            //getContextClassLoader是线程对象的方法，可以获取到当前线程的类加载对象
            //getResouerce【获取资源】这是类加载器的方法 ，当前线程的类加载器默认从类的根路径下加载资源
            //这种方法只能获取到src内的资源，其他地方的就无法获取到了
            String path = Thread.currentThread().getContextClassLoader().getResource("peopertiesTest.properties").getPath();
            //相对路径
            FileReader f = new FileReader(path);
            Properties p= new Properties();
            p.load(f);
            Object o = p.getProperty("username");
            Class c = o.getClass();
        System.out.println(c);
        System.out.println(o);
//            InputStream i = Thread.currentThread().getContextClassLoader()
//                    .getResourceAsStream(path);
//            以流的形式返回
            //p.load(i);
//            String username = p.getProperty("username");//通过getProperties来拿到文件的等号右边的值
//            System.out.println(username);
//            Class d = Class.forName(username);
//            Object o = c.newInstance();
//            System.out.println(o);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }


    }
}
