package 线程;

/**
 * @Author
 * @Date
 * 设置优先级，通过SetPriority来调用优先级,但是这个也只是给操作系统提供一个建议而已，具体运行顺序还是得看操作系统按照但是资源进行
 */
public class SetPriority {
    public static void main(String[] args) {
        QThread qt = new QThread();
        SThread st = new SThread();
        st.setPriority(Thread.MAX_PRIORITY);//
        qt.setPriority(Thread.MIN_PRIORITY);
        st.start();
        qt.start();

    }
}
class QThread extends Thread{
    int i =0;
    public void run(){

           try {
               while (i<15){
                   System.out.println("QThread正在运行："+i);
                   i++;
                   sleep(1000);
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

class  SThread extends Thread{
    int i=0;
    public void run() {

            try {
                while (i<20) {
                    System.out.println("SThread正在运行："+i);i++;
                    sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

