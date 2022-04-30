package Reflection;

/**
 * @Author
 * @Date
 * 可变长度参数
 * int ...args这就是可变长度参数
 * 语法是： 类型...(注意，一定是三个点)
 */
public class VariableLengthParameter {
    public static void main(String[] args) {
    m1();//里面放不放参数都可以
    m2("abc","dasdas","d");
    m3(1,1.2);
    m2(new String[]{"我","是","中","国","人"});//也可以传递一个参数数组进去
    }

    public static void  m1(int...args){
        System.out.println("m1参数被调用了");
    }
    public static void  m2(String...args){
        System.out.println("m2参数被调用了");
    }
    public static void  m3(int i,double...args){//注意这个可变长度参数只能放在长度参数的最后，不然无法使用
        System.out.println("m3参数被调用了");
    }
}
