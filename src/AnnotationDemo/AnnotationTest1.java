package AnnotationDemo;

/**
 * @Author
 * @Date
 */

@Deprecated//注解放在这里就代表这个类已经过时
public class AnnotationTest1 {

    @Deprecated//用来表示这个方法已经过时
    public void dosome(){
        System.out.println("dosome被调用");
    }

    public void doget(){
        System.out.println("doget方法被调用");
    }
}
class one{
    public static void main(String[] args) {
        AnnotationTest1 a = new AnnotationTest1();//在调用带有这个注解的类中会出现下划线，表示已经过时
        a.dosome();//在调用带有这个注解的方法中会出现下划线，表示已经过时，并且控制台会给出提示
        a.doget();
    }
}