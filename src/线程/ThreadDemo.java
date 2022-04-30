package 线程;

/**
 * @Author
 * @Date
 */
public class ThreadDemo extends Thread{
    private static int i=0 ;
    public void run(){
            try {
               while(i<10){
                    System.out.println("i的次数"+i);
                    i++;
                sleep(3000);}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class test02 extends Thread{
    public void run(){

            try {
                for (int i=0;i<=15;i++){
                    System.out.println(i);}
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

