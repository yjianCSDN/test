package 线程;

/**
 * @Author
 * @Date
 */
public class Multithreadsynchronization {
    public static void main(String[] args) {
        for(int i =0;i<=5;i++){
            new Thread(new SyncThread(i)).start();

        }
    }
}

class SyncThread extends Thread{
    private int x;



    public  SyncThread(int i) {
        this.x = i;
    }
    public void run(){
        try {

            for(int i = 0;i<=10;i++) {
                System.out.println("线程" + this.x + "正在运行，输出值为" + i);
                sleep(500);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//class B extends Thread{
//    public void run(){
//
//    }

