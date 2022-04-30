package Test;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflectTest {
    public static void main(String[] args) throws Exception {
    FileReader f = new FileReader("peopertiesTest.properties");
        Properties p = new Properties();
        p.load(f);
        f.close();
        String o = p.getProperty("username");
        //反射机制的灵活性：
        //Java代码写一遍，在不改变Java源代码的基础上，可以做到不同对象的实例化
        //符合ocp开闭原则：对扩展开放，对修改关闭
        System.out.println(o);
        Class c = Class.forName(o);
        //通过反射化实例对象
        Object a = c.newInstance();//实例化
        System.out.println(a);
        //通过反射方法可以获取class文件内的方法对象
        Method[] declaredMethods = c.getDeclaredMethods();
        for (int i = 0;i<declaredMethods.length;i++){
            System.out.println(declaredMethods[i]);
        }

    }

}
