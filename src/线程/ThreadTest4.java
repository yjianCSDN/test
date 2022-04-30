package 线程;

/**
 * @Author
 * @Date
 */
public class ThreadTest4 {
    public static void main(String[] args) {
        ThreadTest3 threadTest3 = new ThreadTest3();
        System.out.println("helloworld");
        threadTest3.setName("t");
        threadTest3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadTest3.interrupt();//这个可以阻断threadTest3的睡眠实践（sleep）。然后可以直接运行
        //System.out.println(threadTest3.getName());
    }
}
class ThreadTest3 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*1000);//这个线程沉睡的时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }for (int i = 0;i<10;i++){
            System.out.println("i--->"+i);
        }


    }
}
