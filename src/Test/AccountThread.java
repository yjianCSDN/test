package Test;

/**
 * @Author
 * @Date
 */
public class AccountThread extends Thread{
    private Account act;
    public AccountThread(Account act){
        this.act=act;
    }

    public void run(){
        double money =5000;
        act.jieqian(money);
        System.out.println(Thread.currentThread().getName()+"对"+act.getNo()+"取款"+money+"成功"+"剩下的钱为："+act.getMoney());
    }
}
