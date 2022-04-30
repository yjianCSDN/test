package 线程;

/**
 * @Author
 * @Date
 */
public class StopThreadTest2 {
    public static void main(String[] args) {
        thread2 t1 = new thread2();

        Thread t = new Thread(t1);
        try {
            Thread.sleep(5000);
            //t.run = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }t.start();
        //终止线程
        //想要什么时候终止将t1中的run改成false即可，这是一种合理的停止方式，让人有准备
        t1.run=false;
    }
}
class thread2 implements Runnable{
    boolean run =true;
    @Override
    public void run() {
        for (int i =0;i<101;i++){
            if (run){//这里要注意if要放在for循环里面，不然会没有想象中的效果
                System.out.println(Thread.currentThread().getName()+"----->"+i);
            }else{
                return;
            }
        }
    }
}
