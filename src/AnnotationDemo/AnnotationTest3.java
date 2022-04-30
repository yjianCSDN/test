package AnnotationDemo;

/**
 * @Author
 * @Date
 */
@Annotation3
public class AnnotationTest3 {
    @Annotation3
    public void dosome(){
        System.out.println("dosome方法被调用");
    }
    @Annotation3
    public void doother(){
        System.out.println("doother方法被调用");
    }
}
