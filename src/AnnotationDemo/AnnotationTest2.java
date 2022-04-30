package AnnotationDemo;

/**
 * @Author
 * @Date
 */
public class AnnotationTest2 {
    @Annotation1(value = "",no = 1111,name = "小明")//在这里可以自己调用自己的注释，但是要把注释中的属性值补全
//    @Annotation1(value = "")这种方法也可以成功调用该注解（因为no属性在设置初就已经设置了默认值了）
    public static void main(String[] args) {

    }
    @Annotation2(value = "123",object = {"","",""},date ={Enum.FRIDAY,Enum.MONDAY})
    //如果一个注解的属性名是value的话（有且只有一个属性名为value，不然value这个名字还是要写的），在使用的时候，该属性名可以省略
    //枚举数组可以这样用
    public void dosome(){

    }
}
