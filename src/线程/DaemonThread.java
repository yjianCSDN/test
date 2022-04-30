package 线程;

/**
 * @Author
 * @Date
 */
public class DaemonThread {
    public static void main(String[] args) {
        DThread dt = new DThread();
        dt.start();
        System.out.println("全部结束");
    }
}
 class DThread extends Thread{

    public DThread(){
        setDaemon(true);
    }
    public void run(){
        while(true){
            System.out.println("后台线程");
        }
    }
}
