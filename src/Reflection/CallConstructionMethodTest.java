package Reflection;

import java.lang.reflect.Constructor;

/**
 * @Author
 * @Date
 * 反射调用无参（有参）构造方法
 */
public class CallConstructionMethodTest {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Reflection.TestStudent");
        //调用无参构造方法：但是这个写法在jdk9就过时了
        Object o = c.newInstance();
        //System.out.println(o);

        //调用有参构造方法
        Constructor con = c.getDeclaredConstructor(String.class,String.class,boolean.class,int.class);
        Object obj = con.newInstance("123456","小明",true,15);
        System.out.println(obj);

        //这里也可以直接调用无参构造方法
        Constructor con1 =c.getDeclaredConstructor();
        Object o1 = con1.newInstance();
        //System.out.println(o1);
    }
}
