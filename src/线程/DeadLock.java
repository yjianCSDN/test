package 线程;

/**
 * 死锁：
 * 死锁是指两个或两个以上的进程在执行过程中，由于竞争资源或者由于彼此通信而造成的一种阻塞的现象，若无外力作用，它们都将无法推进下去。”
 * 那么我们换一个更加规范的定义：“集合中的每一个进程都在等待只能由本集合中的其他进程才能引发的事件，那么该组进程是死锁的。
 *死锁的必要条件：
 * 1.互斥条件（一个资源每次只能被一个线程使用）
 * 2.请求和保持条件（一个线程因请求资源被堵塞时，对已获得的资源不放）
 * 3.不剥夺条件（线程已获得的资源，在未用完之前不能进行剥夺）
 * 4.循环等待条件（若干线程之间形成一种头尾相接的循环等待关系）
 *这四个条件缺一不可
 * 但是全部放在一个class文件里面来执行
 */
public class DeadLock {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }
    private static class Thread1 implements Runnable{
        //    private static Object a;
//    private static Object b;
//    public Thread1(Object lock1,Object lock2){
//        this.a=lock1;
//        this.b=lock2;
//    }
        public void run(){
            synchronized (lock1){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }synchronized (lock2){
                System.out.println("Thread !");
            }
        }
    }

     private static class Thread2 extends Thread{
//    public Thread2(Object lock2) {
//    }

        public void run(){
            synchronized (lock2){
                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }synchronized (lock1){
                System.out.println("Thread !");
            }

        }



    }
}


