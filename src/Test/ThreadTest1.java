package Test;

/**
 * @Author
 * @Date
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Account a = new Account(1,100000.0);
        //建立两个线程，并直接启动
        Account b = new Account(2,50000);
        Thread t1 = new AccountThread(a);
        Thread t2 = new AccountThread(a);
        Thread t3 = new AccountThread(b);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();

//        a.jieqian(5000);
//        System.out.println("剩下的钱为："+a.getMoney());
    }


}
