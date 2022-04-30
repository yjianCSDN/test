package AnnotationDemo;

/**
 * @Author
 * @Date
 */
public @interface Annotation1 {//这个就是注释的内容
    String value();//看着像一个方法，但是其实是一个属性。里面可以自己添加属性
    //如果一个注解中有属性，那么必须给这个属性赋值（除非该属性使用default制定了默认值）
    int no()default 10001;//可以使用default来默认这个属性的值，这样在应用这个注释的时候就可以可写可不写这个属性
    String name();
}
