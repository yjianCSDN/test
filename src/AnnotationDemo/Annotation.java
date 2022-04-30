package AnnotationDemo;

/**
 * @Author
 * @Date
 * 注解方法具体如下：
 * @Target(ElementType.METHOD)（修饰注解的注解，也叫做元注解）
 * @Retention(RetentionPolicy.SOURCE)
 * public @interface Override {
 * }
 *
 */
public class Annotation {
@Override//重写注解，专门用来修饰方法的（放在其他地方都会报错），用来查看重写的格式是否正确
//@Override这个注解是给编译器参考的，和运行阶段没有关系
//凡是Java方法中带有这个注解的，编译器都会进行编译检查，如果这个方法不是重写，编译器就会发现并提示
    public String toString(){
    return "toString";
}
}
