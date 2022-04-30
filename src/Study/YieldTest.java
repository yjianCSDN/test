package Study;



/**
 * @Author
 * @Date
 */
public class YieldTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Threadtest());
        thread.setName("t");
        thread.start();
        for (int i =0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }

    }
}
class Threadtest implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<1000;i++){
            if (i%100==0){
                Thread.yield();//线程让位
                //yield()方法就是让当前线程暂停一下，让给主线程
                System.out.println(Thread.currentThread().getName()+"="+i);
            }


        }
    }
}