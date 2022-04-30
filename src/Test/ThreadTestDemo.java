package Test;

/**
 * @Author
 * @Date
 */
public class ThreadTestDemo {
        public static void main(String[] args) throws InterruptedException {
            Object lockA = new Object();
            Object lockB = new Object();
            Object lockC = new Object();
            ThreadA threadA = new ThreadA("ThreadA", lockC, lockA);
            ThreadB threadB = new ThreadB("ThreadB", lockA, lockB);
            ThreadC threadC = new ThreadC("ThreadC", lockB, lockC);
            threadA.start();
            try {
                Thread.sleep(500);
                threadB.start();
                Thread.sleep(500);
                threadC.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

class ThreadA extends Thread {

    private Object lockC;
    private Object lockA;

    public ThreadA(String name, Object lockC, Object lockA) {
        super(name);
        this.lockC = lockC;
        this.lockA = lockA;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 3) {
            synchronized (lockC) {
                synchronized (lockA) {
                    System.out.println("A" + i);
                    lockA.notify();
                }
                try {
                    if(i != 100){
                        lockC.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class ThreadB extends Thread {

    private Object lockA;
    private Object lockB;

    public ThreadB(String name, Object lockA, Object lockB) {
        super(name);
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 3) {
            synchronized (lockA) {
                synchronized (lockB) {
                    System.out.println("B" + i);
                    lockB.notify();
                }
                try {
                    if(i != 98){
                        lockA.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class ThreadC extends Thread {

    private Object lockB;
    private Object lockC;

    public ThreadC(String name, Object lockB, Object lockC) {
        super(name);
        this.lockB = lockB;
        this.lockC = lockC;
    }

    @Override
    public void run() {
        for (int i = 3; i <= 100; i += 3) {

            synchronized (lockB) {
                synchronized (lockC) {
                    System.out.println("C" + i);
                    lockC.notify();
                }
                try {
                    if(i != 99){
                        lockB.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
