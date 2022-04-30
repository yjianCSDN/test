package 线程;

/**
 * @Author
 * @Date
 */
public class CurrentThread {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
        CurrentThreadTest currentThreadTest = new CurrentThreadTest();
        CurrentThreadTest currentThreadTest1 = new CurrentThreadTest();
        currentThreadTest.setName("firstThread");//设置当前线程的对象
        System.out.println(currentThreadTest1.getName());//获取当前线程的名字并输出



        String name = currentThreadTest.getName();
        System.out.println(name);
        currentThreadTest.start();//启动线程
        try {
            currentThreadTest.sleep(5000);
            //看似让currentThreadTest这个线程休眠了5秒，但是实际上真正语法变成了Thread.sleep(5000)
            //也就是说让当前线程休眠了5秒，出现在哪个线程就是让哪个线程休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class CurrentThreadTest extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);//让当前线程进行睡眠
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName());//获取当前线程的对象，放在哪儿就是代表哪儿的对象
            for (int i =0;i<10;i++){
                System.out.println("t的值--->" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
