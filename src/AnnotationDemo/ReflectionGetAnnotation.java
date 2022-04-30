package AnnotationDemo;

/**
 * @Author
 * @Date
 */
public class ReflectionGetAnnotation {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("AnnotationDemo.AnnotationTest3");
        System.out.println(c.isAnnotationPresent(Annotation3.class));//判断这个类上面是否有这个对象(Annotation.class)
        if (c.isAnnotationPresent(Annotation3.class)){

        }
    }
}
