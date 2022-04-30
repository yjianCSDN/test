package 线程;

import static java.lang.Thread.sleep;

/**
 * @Author
 * @Date
 */
public class Join extends Thread
{
    int i=0;
    public void Runnable(){
    }
    public void run(){

        try {
            for (int i=0;i<=15;i++) {
                System.out.println("i的值为--->"+i);
                sleep(500);
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("程序捕获了异常");
        }
    }
    }


class Ruannable2 extends Thread {
    private int j = 0;
    Join a;

    public Ruannable2(Join rt) {
        super("Runnabledemo线程");
        this.a = rt;
    }

    public void run() {

        try {
            while (j <= 20) {
                if (j!=10) {
                    System.out.println(a.getName()+"运行第：" + j + "次");
                    j++;
                    sleep(500);
                }else {

                    a.join();//如果当j=10的时候进入else范围，然后Ruannable进入堵塞状态，让Join先运行

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



