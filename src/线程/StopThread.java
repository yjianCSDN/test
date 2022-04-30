package 线程;

/**
 * @Author
 * @Date
 */
public class StopThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new thread());
        thread1.setName("i");
        thread1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }thread1.stop();//这个方法能够直接中断thread1的执行，但是已过时（不建议使用）
    }
}
class thread implements Runnable{

    @Override
    public void run() {
        for (int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}