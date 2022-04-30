package Study;

/**
 * @Author
 * @Date
 */
public class ThreadTestDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main begin");
        Thread t = new Thread(new runnable());
        t.setName("t");
        t.start();
        t.join();//合并到当前线程中，当先线程受阻，t线程执行直到结束
        System.out.println("mian over");
    }
}
class runnable implements Runnable{

    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}