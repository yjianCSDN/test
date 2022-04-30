package Study;

/**
 * @Author
 * @Date
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("最高优先级" + Thread.MAX_PRIORITY);
        System.out.println("默认优先级" + Thread.NORM_PRIORITY);
        System.out.println("最低优先级" + Thread.MIN_PRIORITY);
        //获取线程的优先级，最高为10，最低为1
        Thread threads = Thread.currentThread();
        Thread thread = new Thread(new thread());
        //优先级较高的，只是抢到的时间片多一些，并不是绝对优先
        thread.setName("t");
        thread.start();
        System.out.println(threads.getName() + "线程的默认优先级是：" + threads.getPriority());
    }
}
class thread implements Runnable{
    public void run(){

    }
}