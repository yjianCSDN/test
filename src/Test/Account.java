package Test;

/**
 * @Author
 * @Date
 */
public class Account {
    private int no;
    private double money;

    public Account(int no, double money) {
        this.no = no;
        this.money = money;
    }
    public Account() {
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public synchronized void jieqian(double money){//实例方法中也可以使用synchronized方法
        //jieqian方法，t1、t2并发这一个方法（t1,t2是两个栈，两个栈操作同一个线程对象）
//        synchronized (this){
            //线程死锁，用来防止两个线程执行过快而导致最后金额数不对的情况
            //这个数据必须是多线程共享的数据，才可以达到多线程
            double early = this.getMoney();
            double late = early-money;
            try {
                Thread.sleep(1000);
                //模拟网络延迟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //最后对余额进行更新
            this.setMoney(late);
//        }

//        System.out.println(Thread.currentThread().getName()+"剩余的钱为："+late);
    }
}
