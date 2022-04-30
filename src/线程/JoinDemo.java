package 线程;

/**
 * @Author
 * @Date
 */
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Join rt = new Join();
        Ruannable2 r = new Ruannable2(rt);

        rt.start();
       // rt.join();
        r.start();//线程同时运行，所以会造成两个线程都在运行的情况（看sleep的时间）

    }
}
