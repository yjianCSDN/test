package AnnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author
 * @Date
 */
@Target({ElementType.TYPE,ElementType.METHOD})//表示注解的注解可以用在什么地方
@Retention(RetentionPolicy.RUNTIME)//表示这个注解能够被反射调用
public @interface Annotation3 {
}
