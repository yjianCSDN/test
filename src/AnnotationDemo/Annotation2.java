package AnnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.MonthDay;

/**
 * @Author
 * @Date
 */
@Target({ElementType.FIELD,ElementType.METHOD})//表示注解的注解可以用在什么地方
@Retention(RetentionPolicy.RUNTIME)//表示这个注解能够被反射调用
public @interface Annotation2 {
    String value();
//    String name();
    String[] object();//数组注解
    Enum[] date();//枚举数组
}
