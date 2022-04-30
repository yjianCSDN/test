package Test;

/**
 * @Author
 * @Date
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t = new threadtest2();
        t.setName("t");
        t.start();
        for (int i =0;i<16;i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class threadtest2 extends Thread{
    public void run(){
        int i =0;
        while(true){
            System.out.println(Thread.currentThread().getName() + "--->" + (++i));
        }
    }
}