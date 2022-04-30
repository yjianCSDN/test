package interfacedemo;

/**
 * @Author
 * @Date
 */
public class test2{
    public static void main(String[] args) {
        test4 t = new test4();
        //需要重写接口中的方法
        t.add();
        t.divide();
    }

}



class test4 implements test1{
    public void add(){
        System.out.println("123456");
    }
    public void divide(){
        System.out.println("654321");
    }
}



class test3 implements test1{
   public void add(){
       System.out.println("使用加法");
   }
    public void divide(){
        System.out.println("使用除法");
    }
}
