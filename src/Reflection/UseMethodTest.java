package Reflection;

import java.lang.reflect.Method;

/**
 * @Author
 * @Date
 * 获取TestStudent类的方法并使用（实例化对象使用）
 * 反射让代码具有通用性，可变化的内容都是写到配置文件当中
 * 将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了
 * 但是Java代码不需要做任何改动这就是反射机制的魅力
 */
public class UseMethodTest {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Reflection.TestStudent");
        Object student = c.newInstance();//实例化一个对象以达到使用该类的方法的目的
        //获取方法
        /*
        * 调用方法需要几个要素？
        * 1.对象student
        *2.方法名称（login、exit等都是）
        *3.实参列表
        * 4.返回值
        * 同理，通过反射对象调用方法也需要这四个要素
        *
        * */
        Method d = c.getDeclaredMethod("login", String.class, String.class);
        //'getDeclaredMethod(String, Class <?>...)'
        // 里面的String.class ，int.class就是调用的参数的类型（需要根据方法里面参数的不同来修改）

        /*
         * 调用方法的四个要素？
         * 1.对象student
         *2.方法名称：login
         *3.实参列表  (String.class,String.class)
         * 4.返回值obj
         * 同理，通过反射对象调用方法也需要这四个要素
         * public Object invoke(Object obj, Object... args) invoke方法
        Method.invoke()方法调用，里面的obj就是实例化的对象名称，这也是反射机制中最重要的一个方法
         * */
        Object obj = d.invoke(student,"小明","123456");

        System.out.println(obj);
    }
}
