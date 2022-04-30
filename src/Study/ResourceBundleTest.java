package Study;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @Author
 * @Date
 * java.util包下提供过了一个资源绑定器，便于获取属性文件中的内容
 * 使用以下这种格式的时候，属性配置文件XXX.properties必须放在类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) throws IOException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("peopertiesTest");
        InputStream i = Thread.currentThread().getContextClassLoader().getResourceAsStream("peopertiesTest.properties");
        //资源绑定器只能绑定XXX.properties文件，并且这个文件必须在类路径下面，文件扩展名也必须是properties
        //在写路径的时候，路径后面的扩展名（properties）不能写
        //使用这种方式就可以不用Thread().currentThread().getContextClassLoader().getpath();这个方法了
        String username = resourceBundle.getString("username");
        System.out.println(username);
        Properties p = new Properties();
        p.load(i);
        String uername = p.getProperty("username");
        System.out.println(uername);
        System.out.println(resourceBundle.getKeys());
    }
}
