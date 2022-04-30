package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author
 * @Date
 */
public class FieldTest01 {
    public static void main(String[] args) throws Exception {
        //获取整个类
        Class student = Class.forName("Reflection.TestStudent");
        System.out.println(student);
        String name = student.getName();
        System.out.println("完整类名为："+name);
        String simpleName = student.getSimpleName();
        System.out.println("简单类名为："+simpleName);

        System.out.println("================================================================================");
        //获取整个类的属性
        Field[] fields = student.getFields();
        //输出整个数组的长度，查看是否符合
        System.out.println(fields.length);//结果为1，与student的属性不相等
        for (Field f:fields){
            System.out.println(f.getName());
            System.out.println(f);
            //遍历输出后发现之后权限为public的能够获取到：public java.lang.String Reflection.TestStudent.name
            //使用getname方法后得到属性名字：name
        }

        System.out.println("================================================================================");
        Field[] f =student.getDeclaredFields();//这个方法可以获取这个类里面的所有属性
        System.out.println(f.length);//输出结果为4，与类里面的属性数量相等
        for (Field a:f){
            int b= a.getModifiers();//进行类型转换，得到a的权限情况
            String s = Modifier.toString(b);//采用toString方法实现将权限表示由int转变为String（详细信息）
            System.out.println(s);//最后再输出即可
            System.out.println(a.getName());//遍历输出后发现所有的属性名字都被输出了（无论权限名字）
            System.out.println(a);//输出结果为：详细信息
            System.out.println(a.getType());//使用type方法能够得到类中的属性的类型
            System.out.println(a.getType().getSimpleName());//
            System.out.println(a.getModifiers());//获取前面的修饰符数量（此时显示的是修饰符的等级）
            System.out.println("================================================================================");
        }


    }
}
