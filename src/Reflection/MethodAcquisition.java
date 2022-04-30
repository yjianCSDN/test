package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

/**
 * @Author
 * @Date
 */
public class MethodAcquisition {
    public static void main(String[] args) throws Exception{
//        Class c = Class.forName("Reflection.MethodInvokeExample");
        Class c = Class.forName("java.util.Date");
        StringBuilder sb = new StringBuilder();
        sb.append(Modifier.toString(c.getModifiers()));
        sb.append(" class "+c.getSimpleName()+"{\n");
//        System.out.println(Modifier.toString(c.getModifiers()));
//        System.out.println(c.getSimpleName());
       Method[] d = c.getDeclaredMethods();
        for (Method m:d){
//            System.out.println(Modifier.toString(m.getModifiers()));//返回方法的权限
            sb.append(Modifier.toString(m.getModifiers()));
            sb.append(" ");
//            System.out.println(m.getReturnType().getSimpleName());//返回方法返回值类型
            sb.append(m.getReturnType().getSimpleName());
            sb.append(" ");
//            System.out.println(m.getName());//返回参数方法名
            sb.append(m.getName());
            sb.append(" ");
            Class<?>[] p = m.getParameterTypes();
        //    System.out.println("=======");
            sb.append("(");
            for (Class a:p){
            //    System.out.println(a.getSimpleName());//获取方法里面的参数类型
                sb.append(a.getSimpleName()+",");
            }
         //   System.out.println("=====");
            if(p.length > 0) {
                //判断是否“，”还存在如果存在就直接删除
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(") "+"{");
            sb.append("\n}");
//            TypeVariable<Method>[] t = m.getTypeParameters();
//            for (TypeVariable<Method> n : t){
//                System.out.println(n.getName());
//            }
            sb.append("\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
