package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @Author
 * @Date
 */
public class ReflectionConstructorTest {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        Class a = Class.forName("Reflection.TestStudent");
        //public class TestStudent {
        sb.append(Modifier.toString(a.getModifiers()));//public
        sb.append(" class ");//class
        sb.append(a.getSimpleName());//TestStudent
        sb.append("{\n");//{ + 转行
        Constructor[] d = a.getDeclaredConstructors();
        for (Constructor c:d){//获取构造方法

            //public TestStudent(String password, String name, boolean sex, int age) {
            sb.append(Modifier.toString(a.getModifiers()));
            sb.append(" ");
            sb.append(a.getSimpleName());
            sb.append(" (");
            //拼接字符串
            Class[] p = c.getParameterTypes();
            for (Class e:p){
                sb.append(e.getSimpleName());//得到方法名
                sb.append(",");
            } if (p.length>0){
                sb.deleteCharAt(sb.length()-1);
            }


            sb.append("){ }\n");

        } sb.append("}");


        System.out.println(sb);
    }
}
