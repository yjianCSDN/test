package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author
 * @Date
 * 反编译文件，通过给出的class文件就可以得到它内部的所有属性
 */
public class DecompileTest {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder s = new StringBuilder();//拼接字符串
//        Class c = Class.forName("Reflection.TestStudent");
        Class c = Class.forName("java.lang.Thread");
        //这里class的名字通过切换就可以得到不同class的属性，这就凸显出了反射的优点：
        //System.out.println(Modifier.toString(c.getModifiers()));
        s.append(Modifier.toString(c.getModifiers()));//获取修饰符
        s.append(" ");
        s.append("Class");
        s.append(" ");
        s.append(c.getSimpleName());//获取简单类名
        s.append("{");
        s.append("\n");

        //System.out.println(c.getSimpleName());
        Field[] d = c.getDeclaredFields();
        for (Field f: d) {
//            System.out.println(f.getName());
//            System.out.println(f.getType());

            String a = Modifier.toString(f.getModifiers());
            //System.out.println(f);
            //System.out.println(a);
            s.append("\t");//增加缩进
            s.append(a);
            s.append(" ");

            s.append(f.getType().getSimpleName());
            s.append(" ");
            s.append(f.getName());
            s.append("\n");
        }

        s.append("\n");
        s.append("}");
        System.out.println(s);

    }
}
