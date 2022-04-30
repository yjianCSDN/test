package interfacedemo;

/**
 * @Author
 * @Date
 */
interface  test1 {
     void add();
    //接口中声明的方法是抽象的
    //在Java中调用接口的方式是implement，并重写接口中的内容
    //接口可以理解为一种特殊的类，里面全部是由全局常量和公共的抽象方法所组成。
    // 接口是解决Java无法使用多继承的一种手段，但是接口在实际中更多的作用是制定标准的。或者我们可以直接把接口理解为100%的抽象类，既接口中的方法必须全部是抽象方法

     void divide();
}
