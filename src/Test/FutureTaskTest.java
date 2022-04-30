package Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author
 * @Date
 */
public class FutureTaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask f =new FutureTask(new Callable() {//匿名内部类
            @Override
            public Object call() throws Exception {//这个call方法就相当于run方法，不同的是这个有返回值
                int a =100;
                int b =200;
                System.out.println("method begin!");
                Thread.sleep(1000*10);
                System.out.println("method end");
                return a+b;//自动装箱（Integer）
            }
        });
        Thread t = new Thread(f);
        f.get();//返回t线程的执行结果
        //这里会等待call方法的执行结果
    }

}
