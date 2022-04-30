package 线程;

/**
 * @Author
 * @Date
 *发生异常
 */
public class abnormal {
    public static void main(String[] args) {
        Join rt = new Join();
        Ruannable2 r = new Ruannable2(rt);

        rt.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rt.interrupt();//当线程到第五秒的时候（5000）程序捕获到异常
    }
}
