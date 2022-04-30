package Reflection;

/**
 * @Author
 * @Date
 */
public class ReflectionGetSuperInterfaceTest {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("java.lang.String");
        //采用getSuperclass()来获取这个类的父类对象
        System.out.println(c.getSuperclass());

        //采用getInterfaces()来得到一个包含接口类的Class数组
        //再使用getName直接取得即可
        Class[] i = c.getInterfaces();
        for (Class s:i){
            s.getName();
            System.out.println(s);
        }
    }
}
