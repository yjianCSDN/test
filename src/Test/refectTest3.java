package Test;

/**
 * @Author
 * @Date
 */
public class refectTest3 {
    //在获取class文件的时候静态代码块也会自动执行
    //这种方法可以用来像调用class文件的静态代码块但不执行其他任何代码
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Test.MyClass");
            //这恶鬼方法 的执行会导致类加载，类加载时，静态代码块执行
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    //静态代码块，在类加载的时候就执行了并且只执行一次
    static {
        System.out.println("静态代码块正在执行！");

    }
}